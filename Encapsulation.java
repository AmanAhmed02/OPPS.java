// Class demonstrating encapsulation with alphanumeric roll number
class Student {
    // Private data members
    private String name;
    private String rollNumber;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for rollNumber
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for rollNumber
    public String getRollNumber() {
        return rollNumber;
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Set values using setter methods
        student1.setName("Aman Ahmed");
        student1.setRollNumber("B2410006022");

        // Display student details
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
    }
}

