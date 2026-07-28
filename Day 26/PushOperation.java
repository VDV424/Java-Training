public class PushOperation {
    private int[] arr;
    private int top;
    private int capacity;

    public PushOperation(int size) {
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
        System.out.println("Pushed " + x);
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PushOperation stack = new PushOperation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
    }
}
