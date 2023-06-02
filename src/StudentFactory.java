
public class StudentFactory {
    public static void main(String[] args) {
        Student student = new Student();

        // Set the name
        student.setName("Naresh Goud");

        // Get the name
        String name = student.getName();
        System.out.println("Naresh Goud: " + name);
    }
}
 