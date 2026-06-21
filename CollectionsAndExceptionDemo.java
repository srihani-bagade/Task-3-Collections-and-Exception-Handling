import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CollectionsAndExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> students = new ArrayList<>();
        students.add("Rahul");
        students.add("Priya");
        students.add("Kiran");

        System.out.println("ArrayList:");
        System.out.println(students);

        // HashSet Example
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");

        System.out.println("\nHashSet:");
        System.out.println(courses);

        // HashMap Example
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Rahul");
        studentMap.put(102, "Priya");

        System.out.println("\nHashMap:");
        System.out.println(studentMap);

        // Try-Catch Example
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }

        // Custom Exception Example
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}