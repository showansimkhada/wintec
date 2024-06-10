//  Double link list class
public class DLL {
	DLLNode head;
	DLLNode tail;

	// Class constructor for DLL class
	DLL() {
		// assigining null values for head and tail attributes
		this.head = null;
		this.tail = null;
	}
	
	// Function to get size or length of the DLL
	public int size() {
		int num = 0;
		DLLNode temp = head;
		while (temp != null)
		{
			num++;
			temp = temp.next;
		}
		return(num);
	}
	
	// Function to add node to the list from head
	public void addToHead(DLLNode nd) {
		if (head == null)
		{
			tail = nd;
		}
		else
		{
			head.prev = nd;
			nd.next = head;
		}
		head = nd;
	}
	
	// Funcion to add node to the list from tail
	public void addToTail(DLLNode nd) {
		if (head == null)
		{
			head = nd;
		}
		else
		{
			tail.next = nd;
			nd.prev = tail;
		}
		tail = nd;
	}
	
	//  Function to delete node from the list
	public DLLNode delNode() {
		DLLNode temp = head;
		if (temp == null)
		{
			return null;
		}
		if (temp.next == null)
		{
			head = null;
			return temp;
		}
		head = head.next;
		head.prev = null;
		temp.next = null;
		return temp;
	}
	
	// Function get the middle element of the list
	public int readMiddleElement() {
		int num = 0;
		int midInt = 0;
		DLLNode temp = head;
		// finding the middle pointer
		int middleP = size()/2;		
		while (temp != null)
		{
			if (middleP == num)
			{
				midInt = temp.num;
			}
			temp = temp.next;
			num++;
		}
		return midInt;
	}	
	
	// Function to print the list from top to bottom
	public DLLNode readElementForward() {
		DLLNode temp = head;
		if (head == null)
		{
			return null;
		}
		while (temp != null)
		{
			System.out.print(temp.num + " ");
			// going forward
			temp= temp.next;		
		}
		System.out.println("\n"); 
		return temp;
	}
	
	// Function to print the list from bottom to top
	public DLLNode readElementBackward() {
		DLLNode temp = tail;
		if (head == null)
		{
			return null;
		}
		while (temp != null)
		{
			System.out.print(temp.num + " ");
			// going backward
			temp = temp.prev;
		}
		System.out.println("\n");
		return temp;
	}
	
	// Function to print prime numbers from the list
	public void primeNum() {
		int count = 0;
		DLLNode temp = head;
		while (temp != null)
		{
			int x = temp.num;
			if (isPrime(x))
			{
				// counting the prime for the printing
				count++;
				System.out.print(x + "\t");
				if ((count) % 5 == 0)
				{
					System.out.println();
					count = 0;
				}	
			}
			temp = temp.next;
		}
		System.out.println("\n");
	}
	
	// Function to check prime number
	public boolean isPrime(int n) {
		if ( n == 1 || n == 0)
		{
			return false;
		}
		for (int  i = 2; i <= Math.sqrt(n); i++)
		{
			// if result is equal to zero the return false
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	// Function to check either the list contains such element
	public boolean contains(int element) {
		DLLNode current = head;
		while(current != null) 
		{
			// checking the element 
			if(current.num == element) 
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}
}