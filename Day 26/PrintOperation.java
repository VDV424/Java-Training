public class PrintOperation {
    private int[] arr;
    private int top;
    private int capacity;

    public PrintOperation(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        PrintOperation stack = new PrintOperation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();
    }
}
