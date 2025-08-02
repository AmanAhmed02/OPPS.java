
abstract class Shape {
    abstract void draw();

    // Concrete method (optional)
    public void info() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle extends Shape and provides implementation for draw()
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

// Subclass Rectangle extends Shape and
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

// Main class with main method
public class Abstraction {
    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        // Call overridden methods
        shape1.draw();  
        shape2.draw();  

        shape1.info();  // Output: This is a shape.
    }
}
