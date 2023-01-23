// Implementing Stack using LinkedList
import java.util.ArrayList;

public class StackImplementation {
    int size;	// no of elements in stack
    Node head;  // keep track of top element

    StackImplementation() {
        size = 0;
    }
	
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }

	// method to push elements in stack
    public void push(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        head = newNode;
        size += 1;
    }

	// method to delete the top element
    public String pop() {
        if (isEmpty())
            return "";
        String poppedElement = head.data;
        head = head.next;
        size -= 1;
        return poppedElement;
    }

	// method to retrieve top element
    public String peek() {
        if (isEmpty()) 
            return "Stack is Empty";
        return head.data;
    }

	// method to check whether stack is empty or not
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        Node newNode = head;
        ArrayList<String> arrayItems = new ArrayList<>();

        while (newNode != null) {
            arrayItems.add(newNode.data);
            newNode = newNode.next;
        }

        return arrayItems.toString();
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        
		// pushing elements in stack and then printing stack
        stack.push("Prince");
        stack.push("Manny");
        stack.push("Phil");
        stack.push("Claire");
        System.out.println(stack);

		// pop and then print stack
        stack.pop();
        System.out.print("After Popping: ");
        System.out.println(stack);

		// print top element
        System.out.println("Peek: " + stack.peek());
		
		// print size of stack
        System.out.println("Size of Stack: " + stack.size);
		
		// check whether stack is empty or not
        System.out.println("isEmpty: " + stack.isEmpty());
    }
}
