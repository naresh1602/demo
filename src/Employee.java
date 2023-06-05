public class Employee {
    private static int totalEmployees;

    public static int getTotalEmployees() {
        // Perform some logic to determine the total number of employees
        return 50;
    }

    static {
        totalEmployees = getTotalEmployees();
    }
}

