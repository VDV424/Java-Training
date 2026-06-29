class GrandFather {
    void showGrandFather() {
        System.out.println("I am GrandFather");
    }
}

class Father extends GrandFather {
    void showFather() {
        System.out.println("I am Father");
    }
}

class Son extends Father {
    void showSon() {
        System.out.println("I am Son");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.showGrandFather();
        s.showFather();
        s.showSon();
    }
}
