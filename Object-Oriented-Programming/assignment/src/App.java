// Student name: Showan Simkhada
// Student ID: 17459655
// Pledge of Honor: I pledge by honor that this program is solely my own work.

public class App {
    public static void main(String[] args) throws Exception {
        // Creating the list for accounts
		BankAccountOperation b = new BankAccountOperation();
		
		// reading the data from the files
		b.operation("src/data/data.txt");
		
		b.displayMenu();
    }
}
