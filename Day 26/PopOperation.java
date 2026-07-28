public class PopOperation {
    private int[] arr;
    private int top;
    private int capacity;

    public PopOperation(int size) {
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

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = arr[top--];
        System.out.println("Popped " + popped);
        return popped;
    }

    public static void main(String[] args) {
        PopOperation stack = new PopOperation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
