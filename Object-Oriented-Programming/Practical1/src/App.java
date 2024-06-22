import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Student name: Showan Simkhada");
		System.out.println("Student ID: 17459655");
		System.out.println("Pledge of Honour: I pledge by honour that this program is solely my own work.");
        formattingEscapeSequence();
        cicleArithmeticCalculation();
        determineGrade();
        cardLetterUserInputValidation();
        collectingAndProcessingAnArrayOfTemperatures();
        aGuessingTest();
        countTheIntersectionOfTwoArray();
        arrayOperations();
    }

    // Queston1
    public static void formattingEscapeSequence() {
		System.out.println("\nQuestion 1:");
		System.out.println("Formatting escape sequence:\n");
		// formatting the print
		System.out.printf("%-30s%s\n", "Escape Sequence", "Description");
		System.out.printf("%-30s%s\n", "---------------", "-----------");
		System.out.printf("%-30s%s\n", "\\n", "New line character");
		System.out.printf("%-30s%s\n", "\\t", "Horizontal tab character");
		System.out.printf("%-30s%s\n", "\\\"", "Double quotes character");
	}

    // Question2
    public static void cicleArithmeticCalculation() {
		System.out.println("\nQuestion 2:");
		System.out.println("Circle arithmetic calculation:");
		System.out.print("Enter a radius: ");
        Scanner input = new Scanner(System.in);
		// reading the data from the user and storing to the radius
		double radius = input.nextDouble();
		// input.close();
		System.out.printf("%-10s%-10s%s\n", "Radius", "Area", "Perimeter");
		System.out.printf("%-10s%-10s%s\n", "------", "----", "---------");
		double Area = radius * radius * Math.PI;
		double Perimeter = radius * 2 * Math.PI;
		System.out.printf("%-10.2f%-10.2f%.2f\n", radius, Area, Perimeter);
	}

    // Question3
    public static void determineGrade() {
		System.out.println("\nQuestion 3:");
		System.out.println("Determine grade:");
		System.out.print("Enter the Grade: ");
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		System.out.printf("\n%-30s%s\n", "Score","Grade");
		// if the score is below 0 and above 100 it will print error
		if (score < 0 || score > 100) {
			System.out.printf("%-30s%s\n", score, "Error");
		}
		else if (score < 50 && score >= 0) {
			System.out.printf("%-30s%s\n", score, "D");
		}
		else if (score >= 50 && score < 70) {
			System.out.printf("%-30s%s\n", score, "C");
		}
		else if (score >= 70 && score < 80) {
			System.out.printf("%-30s%s\n", score, "B");
		}
		else {
			System.out.printf("%-30s%s\n", score, "A");
		}
	}
	
	// Question 4
	public static void cardLetterUserInputValidation() {
		System.out.println("\nQuestion 4:");
		System.out.println("Card letter user input validation:\n");
		String letter;
		System.out.println("Enter the letter of the card: ");
		Scanner input = new Scanner(System.in);
		letter = input.nextLine().toUpperCase();
		System.out.printf("%-20s%s", "Letter", "Message\n");
		//Store the value
		
		while(!letter.equals("J") && !letter.equals("Q") && !letter.equals("K") && !letter.equals("A")) {
			System.out.printf("%-20S%s", letter, "Error\n");
			System.out.println("Retry");
			System.out.print("Enter the letter of the card: ");
			letter = input.nextLine().toUpperCase();
			System.out.printf("%-20s%s", "Letter", "Message\n");
		}
		switch(letter) {
			case "J":
				System.out.printf("%-20S%s", letter, "Jack\n");
				break;
			case "Q":
				System.out.printf("%-20S%s", letter, "Queen\n");
				break;
			case "K":
				System.out.printf("%-20S%s", letter, "King\n");
				break;
			case "A":
				System.out.printf("%-20S%s", letter, "Ace\n");
				break;
		}
	}

    // Question 5
    public static void collectingAndProcessingAnArrayOfTemperatures() {
		System.out.println("\nQuestion 5:");
		System.out.println("Collecting and processing an array of temperatures:\n");
		System.out.print("How many sensors are currently collecting data: ");
		Scanner input = new Scanner(System.in);
		// assuming the user will enter the value l
		int l = input.nextInt();
		double data[] = new double[l];
		double sum = 0;
		// creating the if loop for to read the input equal to the l
		for ( int i = 0; i <= l-1; i++) {
			System.out.print("Enter the temperature #" + i + ": ");
			data[i] = input.nextDouble();
			sum = data[i] + sum;
		}
		// input.close();
		double avTemp = sum/l;
		System.out.println("Average temperature :" + avTemp + " out of " + l + " sensors.");
		double maxTemp = 0;
		for (int i = 0; i <= l-1; i++) {
			if(data[i] > maxTemp) {
				maxTemp = data[i];
			}
		}
		System.out.printf("%s%.2f", "Maximum temperature : " , maxTemp);
		System.out.println();
		int count = 0;
		for (int i = 0; i <= l-1; i++) {
			if (data[i] > 10 || data[i] < 20) {
				count++;
			}
		}
		System.out.println("Number of temperature between 10-20: " + count);
	}

    // Question 6
    public static void aGuessingTest() {
		System.out.println("\nQuestion 6:");
		System.out.println("A guessing test:\n");
		// storing the data in the arrays
		String[] Country = {"Greece", "Thailand", "China", "Germany", "Netharlands", "Turkey"};
		String[] Capital = {"Athens", "Bangkok", "Beijing", "Berlin", "Amsterdam", "Ankara"};
		// creating the random number from 0 to 5
		int r = ThreadLocalRandom.current().nextInt(0, 6);
		System.out.println("Which country has the capital city "+ Capital[r]);
		System.out.println("Enter up to 3 names, comma-separated: ");
		Scanner input = new Scanner(System.in);
		// storing the string by split function
		String[] guess = input.nextLine().split(",");
		while (guess.length > 3) {
			System.out.println("Invalid entry please try again\nEnter up to 3 names, comma-separated: ");
			input = new Scanner(System.in);
			guess = input.nextLine().split(",");
		}
		// input.close();
		if(guess[0].equals(Country[r]) || (guess[1].equals(Country[r])) || guess[2].equals(Country[r])) {
			System.out.println("The country is " + Country[r]);
			System.out.println("Your answer is correct");
		}
		else {
			System.out.println("The country is " + Country[r]);
			System.out.print("Your answer is incorrect");
		}
	}

    // Question 7
    public static void countTheIntersectionOfTwoArray() {
		System.out.println("\nQuestion 7:");
		System.out.println("Count the intersection of two array:\n");
		System.out.print("Enter the first line of comma-separated numbers: ");
		Scanner input = new Scanner(System.in);
		String[] first = input.nextLine().split(",");
		System.out.print("\nEnter the second line of comma-separated numbers: ");
		String[] second = input.nextLine().split(",");
		while(first.length == second.length) {
			System.out.println("Please enter the line with different length\nEnter the first line of comma-separated numbers: ");
			input = new Scanner(System.in);
			first = input.nextLine().split(",");
			System.out.println("Enter the second line of comma-separated numbers: ");
			second = input.nextLine().split(",");
		}
		// input.close();
		int firstLength = first.length;
		int secondLength = second.length;
		double[] array1 = new double[firstLength];
		double[] array2 = new double[secondLength];
		for (int i = 0; i < array1.length;) {
            for (int j = 0; j < first.length; j++) {
				// storing the values from the string arrays to double array with nested loops
				array1[i] = Double.parseDouble(first[j]);
				i++;
			}
        }
		
		for (int i = 0; i < array2.length;) {
			for (int j = 0; j < second.length; j++) {
				array2[i] = Double.parseDouble(second[j]);
				i++;
			}
		}
		int count = 0;
		for (double d1 : array1) {
			for (double d2 : array2) {
				// using nested loop to count the overlapped elements inn the array
				if(d1 == d2)
				{
					count++;
				}
			}
		}
		System.out.println("The number of ovelapping numbers: " + count);	
	}

    // Question 8
    public static void arrayOperations() {
		System.out.println("\nQuestion 8:");
		System.out.println("Array operations:\n");
		System.out.print("Enter a line of comma-separated temperatures: ");
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split(",");
		input.close();
		int lineLength = line.length;
		double[] array = new double[lineLength];
		for(int i = 0; i < array.length;) {
			for (int j = 0; j < line.length; j++) {
				array[i] = Double.parseDouble(line[j]);
				i++;
			}
		}
		
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		double av = sum/array.length;
		System.out.printf("%s%.2f", "Average temperature: ", av);
		// assuming the max value as zero
		double max = 0;
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.printf("%s%.2f", "\nMaximum temperature: ", max);
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0 && array[i] <= 10) {
				count++;
			}
		}
		System.out.print("\nThere are " + count + " temperatures between 0-10.");
	}

}
