public class Tree {
    public Node root;
	// Class constructor for tree class
	Tree() {
        // Assigining value to root attributes
		this.root = null;
	}
	
    // Function to insert into the tree
	public void insert(Node nd) {
		Node temp = root;
		if(root == null) {
			root = nd;
			return;
		}
		while(true) {
			// if the node is less than the temp than add it to the left
			if (nd.num < temp.num) {
				if(temp.left == null) {
					temp.left = nd;
					break;
				}
				temp = temp.left;
			}
			else {
				if(temp.right == null) {
					temp.right = nd;
					break;
				}
				temp = temp.right;
			}	
		}
	}
	
    // Function to get the length or the size of the tree
	public int size(Node root) {
		if (root == null) {
			return 0;
		}
		return (size(root.left) + size(root.right) + 1);
	}
	
    // Function to print the tree in increasing order
	public void printIncOrder(Node nd) {
		if(nd == null) {
			return;
		}
		// using recursion for printing the tree in increasing order
		printIncOrder(nd.left);
		System.out.print(nd.num + " ");
		printIncOrder(nd.right);
		return;
	}
	
    // Function to get height of the tree
	public int getHeight() {
		if(size(root.left) > size(root.right)) {
			return size(root.left);
		}
		return size(root.right);
	}
	
    // Funtion to get the prime number from the tree
	public int primeNum(Node nd) {
		// creating the count for root, left children and right children
		int count = 0;
		int countL, countR;
		if(nd == null) {
			return 0;
		}
		else
		{
            if(isPrime(nd.num)) {
                count++;
            }
			// using recursion to count the prime number in left children and right children
			countL = primeNum(nd.left);
			countR = primeNum(nd.right);
		}
		return count + countL + countR;
	}
	
    // Function to check prime number
	public boolean isPrime(int n) {
		if ( n == 1 || n == 0) {
			return false;
		}
		for (int  i = 2; i <= Math.sqrt(n); i++) {
			// if rem is equal to zero then return false
			if (n % i == 0) {
                return false;
            }
		}
		return true;
	}
	
	public void levelByLevel(Node nd) {
		// creating the Queue to store the node
		TQueue Q = new TQueue();
		QNode qnd = new QNode(nd);
		Q.addToTail(qnd);
		QNode deletedNode;
		// creating while loop
		while(true)
		{
			int lev  = Q.size();
			if (lev == 0) {
				break;
			}
			while(lev > 0) {
				// storing the deleted node from the queue
				deletedNode = Q.deleteFromHead();
				System.out.print(deletedNode.TNode.num + " ");
				if(deletedNode.TNode.left != null) {
					QNode left = new QNode(deletedNode.TNode.left);
					Q.addToTail(left);
				}
				if(deletedNode.TNode.right != null) {
					QNode right = new QNode(deletedNode.TNode.right);
					Q.addToTail(right);
				}
				lev--;
			}
			System.out.println();
		}
	}
}
