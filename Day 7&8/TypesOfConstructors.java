class Student {
    String name;
    int rollNo;

    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    Car(Car other) {
        this.brand = other.brand;
        this.year = other.year;
    }

    void display() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }
}

public class TypesOfConstructors {
    public static void main(String[] args) {

        System.out.println("1. Default Constructor");
        Student s1 = new Student();
        s1.display();

        System.out.println("\n2. Parameterized Constructor");
        Employee e1 = new Employee("Varun", 75000);
        Employee e2 = new Employee("Rahul", 60000);
        e1.display();
        e2.display();

        System.out.println("\n3. Copy Constructor");
        Car c1 = new Car("Toyota", 2025);
        Car c2 = new Car(c1);
        c1.display();
        c2.display();
    }
}
