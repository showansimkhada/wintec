import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;

public class App {
    // Replace filepath with file location
    public static Hashtable<String, Integer> ht = FilePath.readFile("filepath");
	
	public static void main(String[] args) {
		displayAll(ht);
		displayRepeatedWordsOnly(ht);
		//displayMaxFrequency(ht);
		displayMaxFrequencyWords(ht);
	}
	
	public static void displayAll(Hashtable<String, Integer> myht) {
        // printing all the elements stored in the hash table
		System.out.printf("%-30s%s\n", "Word", "Frequency");
		System.out.println("---------------------------------------");
		for (Entry<String, Integer> entry : myht.entrySet()) {
			System.out.printf("%-30s%s\n", entry.getKey() ,entry.getValue());
		}
	}
	
	public static void displayRepeatedWordsOnly(Hashtable<String, Integer> myht) {
        // printing all the words that are repeated
		for (Entry<String, Integer> entry : ht.entrySet()) { 
			if (entry.getValue() > 1) {
				System.out.printf("The repeated word is '%s' and frequency in the file is '%d'.\n", entry.getKey(), entry.getValue()); 
			}
		}
	}
	
	public static void displayMaxFrequency(Hashtable<String, Integer> myht) {
        // printing only one word with the maximum frequency
		String mostRep = null;
		int rep = 0;
		for (Entry<String, Integer> entry : ht.entrySet()) {
			if(entry.getValue() > rep) {
				mostRep = entry.getKey();
				rep = entry.getValue();
			}
		}
		System.out.printf("The most repeated word in input the file is : '%s' and frequency is :'%d' \n", mostRep, rep);
	}
	
	public static void displayMaxFrequencyWords(Hashtable<String, Integer> myht) {
		int max = Collections.max(ht.values()); 
		for (Entry<String, Integer> entry : ht.entrySet()) { 
			if (entry.getValue() == max) {
				System.out.printf("The most repeated word in input the file is : '%s' and frequency is :'%d' \n", entry.getKey(), max); 
			}
		}
	}
}
