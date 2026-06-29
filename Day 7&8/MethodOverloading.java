class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println("add(10, 20) = " + m.add(10, 20));
        System.out.println("add(10, 20, 30) = " + m.add(10, 20, 30));
        System.out.println("add(5.5, 3.5) = " + m.add(5.5, 3.5));
    }
}
