class Person {
    // Private fields (hidden from outside)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name (with validation)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age (with validation)
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setters (encapsulation)
        person.setName("Alice");
        person.setAge(25);

        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying invalid values
        person.setName("");  // Invalid name!
        person.setAge(150);  // Invalid age!
    }
}