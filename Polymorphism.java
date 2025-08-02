// Compile-time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Run-time Polymorphism (Method Overriding)
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate both types
public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Add 2 int: " + calc.add(10, 20));
        System.out.println("Add 2 double: " + calc.add(5.5, 3.2));
        System.out.println("Add 3 int: " + calc.add(1, 2, 3));

        System.out.println();

        // Run-time polymorphism
        Animal a;

        a = new Dog();  
        a.makeSound();   

        a = new Cat();   
        a.makeSound();  
    }
}
