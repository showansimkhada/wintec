import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccountOperation {
    // Creating the list for the accounts
    List<BankAccount> accounts;
    List<BankAccount> getAccounts() {
        return accounts;
    }

    public void operation(String filename) {
        // creating the array for the accounts
		accounts = new ArrayList<>();
		// reading the data from file name
		readBankAccountData(filename);
		displayMenu();
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		// creating while loop only if its true
        while(true) {
            System.out.print("\nSelect an option: ");
            opt = sc.nextInt();
            if(opt < 0 || opt > 7) {
                System.out.print("\nInvalid option.\nMust be 1 - 7 (or 0 for menu)");
                continue;
            }
            switch(opt) {
                case 0:
					displayMenu();
					break;
				case 1:
					doDeposit();
					break;
				case 2:
					doWithdraw();
					break;
				case 3:
					displayHighestBalanceAccount();
					break;
				case 4:
					displayMostActiveAccount();
					break;
				case 5:
					displayAllAccounts();
					break;
				case 6: {
					int total = getTotalTransactions(accounts);
					System.out.println("Total transactions: " + total);
					break;
				}
				case 7:
					farewell();
					return;
            }
        }
    }

    void readBankAccountData(String fileName) {
		File f = new File(fileName);
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String inp = sc.nextLine();
				String[] inp1 = inp.split(",");
				String name = inp1[0];
				int Age = (int) Double.parseDouble(inp1[1]);
				String ID = inp1[2];
				double Balance = Double.parseDouble(inp1[3]);
				int Type = (int) Double.parseDouble(inp1[4]);
				BankAccount b = new BankAccount(name, Age, ID, Balance, Type);
				accounts.add(b);
			}
		} catch(IOException e) {
			System.out.println("Error" + e.toString());
		}
	}

    void displayMenu() {
		System.out.println("\n\n*******************************");
		System.out.println("* Bank Account Operation Menu *");
		System.out.println("\n\n*******************************");
		System.out.println("0. Display Menu");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Display Highest Balance Account");
		System.out.println("4. Display Most Active Account");
		System.out.println("5. Display All Accounts");
		System.out.println("6. Display Total Number of Transactions");
		System.out.println("7. Exit");
	}

    void doDeposit() {
		System.out.print("\nDoDeposit");
		System.out.print("\nEnter an account id for deposit: ");
		Scanner input = new Scanner(System.in);
		String opt = input.next();
		for(int i = 0; i < accounts.size(); i++) {
			if(opt.equals(accounts.get(i).accountID)) {
				System.out.print("\nEnter amount: ");
				int amt = input.nextInt();
				accounts.get(i).deposit(amt);
				return;
			}
		}
		System.out.print("\nAccount doesnot exists: " + opt);
		return;	
	}

    void doWithdraw() {
		System.out.print("\nDoWithdraw");
		System.out.print("\nEnter an account id for withdrawl: ");
		Scanner input = new Scanner(System.in);
		String opt = input.next();
		for(int i = 0; i < accounts.size(); i++) {
			if(opt.equals(accounts.get(i).accountID))
			{
				System.out.print("\nEnter amount: ");
				int amt = input.nextInt();
				accounts.get(i).withDraw(amt);
				return;
			}
		}
		System.out.print("\nAccount doesnot exists: " + opt);
		return;
	}

    void displayHighestBalanceAccount() {
		System.out.print("\nDisplayHighestBalanceAccount...");
		System.out.print("\n---------Bank account with highest balance--------");
		BankAccount h = accounts.get(0);
		for(BankAccount b : accounts) {
			// checking for the highest balance in list of accounts
			if(h.getBalance() < b.getBalance())
			{
				h = b;
			}
		}
		h.displayInfo();
	}

    void displayMostActiveAccount() {
		System.out.print("\nDisplayMostActiveAccount...");
		System.out.print("\n---------Bank account with most transactions--------");
		BankAccount m = accounts.get(0);
		for(BankAccount b : accounts) {
			// checking which account has the most transaction
			if(m.getTransactionCounter() < b.getTransactionCounter()) {
				m = b;
			}
		}
		m.displayInfo();
	}

    public void displayAllAccounts() {
		for(int i = 0; i < accounts.size(); i++) {
			accounts.get(i).displayInfo();
		}
	}

    public int getTotalTransactions(List<BankAccount> list) {
		int total = 0;
		// if student size is zero or student list is empty return 0;
		if (list.size() == 0 || list == null) {
			return 0;
		} else {
			int transaction = list.get(0).getTransactionCounter();
			// creating the sub list from the bank account list
			List<BankAccount> subList = list.subList(1, list.size());
			total = transaction + getTotalTransactions(subList);
		}
		return total;
	}

    void farewell() {
		System.out.println("Thanks for using the service. Bye!");
	}
}
