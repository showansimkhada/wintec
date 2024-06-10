import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // create int array
        int[] myIntArray = readFile();

        System.out.println("Q No. 1. Find the minimum number?");
		int min = minimumNumber(myIntArray);
		System.out.println("The minimum number from the array is "+ min +".\n");
		
		System.out.println("Q No. 2. Find the position of the minimum number?");
		int order = orderOfMinNumber(myIntArray);
		System.out.println("The minimum number is " + min +" which lies in the position "+order+".\n");
		
		System.out.println("Q No. 3. Find the number of prime numbers?");
		int countPrime = countPrime(myIntArray);
		System.out.println("The number of the prime numbers in the array is "+ countPrime +".\n");
		
		System.out.println("Q No. 4. Find the average number?");
		double av = averageNumber(myIntArray);
		System.out.println("The average number from the array is " + av +".\n");
		
		System.out.println("Q No. 5. Find the number of numbers that are bigger than the average number?");
		int GTAN = greaterthanAvNumber(myIntArray);
		System.out.println("The number of the numbers bigger than the average number is " + GTAN +".\n");
		
		System.out.println("Q No. 6. Are all numbers equal in the array?");
		boolean ANE = allNumbersEqual(myIntArray);
		System.out.println("This statement is "+ ANE +".\n");
		
		System.out.println("Q No. 7. Are all numbers different in the array?");
		boolean ADN = allDifferentNumber(myIntArray);
		System.out.println("This statement is "+ ADN + ".\n");

    }

    public static int[] readFile() {
        // Create integer array of 20
        int[] myIntArray = new int[20];

        // Importing the files
        // replace filelocation with the file path
        File f = new File("filelocation");

        // importing datas from the files
        try {
            Scanner sc = new Scanner(f);
            for (int i = 0; i < myIntArray.length; i++) {
                myIntArray[i] = sc.nextInt();
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Cannot get the file pleace check the file location " + e.getMessage());
        }

        return myIntArray;
    }

    public static int minimumNumber(int[] myIntArray)
	{
		// Declaring minimum value in the array
		int minValue = myIntArray[0];
		
		for (int i = 1; i < myIntArray.length; i++)
		{
			// if greater than min value then assign greater value
			if (myIntArray[i] < minValue)
			{
				minValue = myIntArray[i];
			}
		}
		return minValue;
	}

    public static int orderOfMinNumber(int[] myIntArray)
	{
		// Declaring the minimum value from the array
		int minValue = myIntArray[0];
		
		// Declaring the order of the array
		int order = 1;
		for (int i = 1; i < myIntArray.length; i++)
		{
			if(myIntArray[i] < minValue)
			{
				minValue = myIntArray[i];
				order = i;
				order++;
			}
		}
		return order;
	}

    public static int countPrime(int[] myIntArray)
	{
		// Declaring the count of prime number
		int count = 0;
		for (int i = 0; i < myIntArray.length; i++)
		{
			if (isPrime(myIntArray[i]))
			{
				// counting the numbers in array especially prime
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int n)
	{
		if ( n == 1)
			return false;
		for (int  i = 2; i < Math.sqrt(n); i++)
		{
			// If n % i is equal to 0 then it gives the result false
			if (n % i == 0)
				return false;
		}
		// If n % i is not equal to 0 then it gives the result true
		return true;
	}
	
	public static double averageNumber(int[] myIntArray)
	{
		// Declaring the average number from the array
		double av = 0;
		
		// Declaring the sum of all numbers in the array
		double sum = 0;
		for (int i = 0; i < myIntArray.length; i++)
		{
			// Calculating the sum of all numbers from the array
			sum = sum + myIntArray[i];
			
			// Calculating the average number from the array
			av = sum/myIntArray.length;
		}
		// Returning the value of average in the method
		return av;
	}
	
	public static int greaterthanAvNumber(int[] myIntArray)
	{
		// Declaring the counting of the numbers greater than the average number
		int count = 0;
		
		for (int i = 0; i < myIntArray.length; i++)
		{
			// IF all numbers in the array are equal than the value will return to 0
			if (allNumbersEqual(myIntArray))
				return 0;
				// Counting the numbers greater than the average in the array
				if (averageNumber(myIntArray) < myIntArray[i])
				{
					count++;
				}
		}
		return count;
	}
		
	public static boolean allNumbersEqual(int[] myIntArray)
	{
		// If the length of the array equals to zero then return false
		if(myIntArray.length == 0) return false;
		
		// Declaring the first element of the array
		for(int i = 0; i < myIntArray.length; i++)
		
		// Declaring the second element of the array
		for(int j = i+1; j < myIntArray.length; j++)
		
		// IF first element is not equal to the second element of the array then return false else true
		if(myIntArray[i]!=myIntArray[j]) return false;
		
		return true;
	}
	
	public static boolean allDifferentNumber(int[] myIntArray)
	{
		// If the length of array is 0 then return false
		if(myIntArray.length == 0) return false;
		
		// Declaring the first element from the array //
		for(int i = 0; i < myIntArray.length; i++)
			
		// Declaring the second element from the array
		for(int j = i+1; j < myIntArray.length; j++)
		
		// If first element of the array is equal to the second element of array then return false else true
		if(myIntArray[i]==myIntArray[j]) return false;
		
		return true;		
	}
}
