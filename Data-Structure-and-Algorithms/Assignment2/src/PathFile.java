import java.util.Scanner;
import java.io.*;

// PathFile Class
public class PathFile {
    // Function to read files from the filepath
	public static DLL ReadFile(String fileName) {
		DLL list = new DLL();
		File f = new File(fileName);
		try
		{
			Scanner sc = new Scanner (f);
			while (sc.hasNextInt())
			{
				DLLNode nd = new DLLNode(sc.nextInt());
				list.addToTail(nd);
			}
			sc.close();
		}
		catch (IOException e)
		{
			System.out.println("Cannot find the file "+e.getMessage());
		}
		return list;
	}
}