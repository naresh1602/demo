
public class StudentFactory {
    public static void main(String[] args) {
        Student student = new Student();

        // Set the name
        student.setName("John Doe");

        // Get the name
        String name = student.getName();
        System.out.println("Name: " + name); // Output: Name: John Doe
    }
}
