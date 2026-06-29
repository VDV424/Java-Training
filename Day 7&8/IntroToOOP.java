class Dog {
    String name;
    String breed;

    void bark() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class IntroToOOP {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";
        d.breed = "Labrador";
        System.out.println("Dog Name: " + d.name);
        System.out.println("Breed: " + d.breed);
        d.bark();
    }
}
