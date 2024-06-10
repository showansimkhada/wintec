import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    // Function to read file from filepath
    public static Tree readFile(String fileName) {
		File f = new File(fileName);
		// creating the new tree
		Tree bst = new Tree();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNext()) {
				// creating tree node
				Node nd = new Node(sc.nextInt());
				bst.insert(nd);
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println("Error" + e);
		}
		return bst;	
	}
}
