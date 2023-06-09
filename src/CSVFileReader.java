import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }
}

public class CSVFileReader {
    public static void main(String[] args) {
        String csvFile = "students.csv"; // Replace with the path to your CSV file
        List<Student> students = readCSVFile(csvFile);

        // Sort the students based on last name
        Collections.sort(students);

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGpa());
        }
    }

    private static List<Student> readCSVFile(String fileName) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0].trim();
                String lastName = data[1].trim();
                double gpa = Double.parseDouble(data[2].trim());
                Student student = new Student(firstName, lastName, gpa);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
