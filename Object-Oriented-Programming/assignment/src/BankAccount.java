class BankAccount extends Person{
    String accountID;
    double balance;
	int accountType;
	int transactionCounter;
	double fee;

    public double getFee() {
		if(getAccountType() == 0) {
			return 3.5;
		} else if(getAccountType() == 1) {
			return 1.5;
		}
		return 0;
	}


	public int getTransactionCounter()
	{
		return transactionCounter;
	}

    public void setTransactionCounter(int transactionCounter) {
		this.transactionCounter = transactionCounter;
	}

    BankAccount(String Name, int Age, String accountID, double balance , int accountType) {
		// calling the super class person
		super(Name, Age);
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public String getAccountID() {
		return accountID;
	}

    public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    public int getAccountType() {
		return accountType;
	}

	public void setaccountType(int accountType) {
		this.accountType = accountType;
	}

    // rewriting the display info in the super class person
    @Override void displayInfo() {
		System.out.print("\nName: " + getName() + "\nAge: " + getAge() + "\nAccount ID: " + getAccountID());
		
		// switching the account type
		switch(getAccountType()) {
            case 0:
			    System.out.print("\nAccount Type: " + "Regular Account");
			    break;
            case 1:
                System.out.print("\nAccount Type: " + "Premium Account");
                break;
            case 2:
                System.out.print("\nAccount Type: " + "VIP Account");
                break;
		}
		// adding long to display the actual balance
		System.out.print("\nAccount Balance: " + (long)getBalance() +"\n");
	}

    boolean deposit(double amt)
	{
		if(getBalance() + amt - getFee() < 0) {
			System.out.print("\nInvalid input. Try again");
			return false;
		} else {
			this.balance = getBalance() + amt - getFee();
			System.out.print("\nDeposit succeeded");
			// after the successful deposit transaction counter is increased
			transactionCounter++;
			return true;
		}
	}

    boolean withDraw(double amt) {
        if (getBalance() - amt - getFee() < 0) {
            System.out.print("\nInvalid input. Try again");
			return false;
        } else {
            this.balance = getBalance() - amt - getFee();
			System.out.print("\nDo not forget to take your cash");
			// after the successful deposit transaction counter is increased
			transactionCounter++;
			return true;
        }
    }
}
