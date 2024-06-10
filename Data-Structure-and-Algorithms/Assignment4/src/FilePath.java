import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class FilePath {
    // Function to import elements and insert to the hash table from file
    public static Hashtable<String, Integer> readFile(String fileName) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		File f = new File(fileName);
		String word;
		try {
			Scanner input = new Scanner(f);
			while(input.hasNext()) {
				word = input.next();
                // checking the keys in the hash map if it contains increase the value by 1
				if(ht.containsKey(word)) {
					ht.put(word, ht.get(word) + 1);
				}
				else {
					ht.put(word, 1);
				}
			}
			input.close();
		}
		catch(IOException e) {
			System.out.print("Error" + e.getMessage());
		}
		return ht;
	}
}
