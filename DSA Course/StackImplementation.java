import java.util.ArrayList;

public class StackImplementation {
    int size;
    Node head;

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

    public String pop() {
        if (isEmpty())
            return "";
        String poppedElement = head.data;
        head = head.next;
        size -= 1;
        return poppedElement;
    }

    public String peek() {
        if (isEmpty()) 
            return "Stack is Empty";
        return head.data;
    }

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
        
        stack.push("Prince");
        stack.push("Manny");
        stack.push("Phil");
        stack.push("Claire");
        System.out.println(stack);

        stack.pop();
        System.out.print("After Popping: ");
        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size of Stack: " + stack.size);
        System.out.println("isEmpty: " + stack.isEmpty());
    }
}
