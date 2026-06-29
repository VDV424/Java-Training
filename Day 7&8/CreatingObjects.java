class Mobile {
    String brand;
    int price;

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

public class CreatingObjects {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 15000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 80000;

        m1.show();
        m2.show();
    }
}
