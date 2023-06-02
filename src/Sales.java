public class Sales {
    public static void main(String[] args) {
        SalesDepartment salesDept = new SalesDepartment(50);
        int departmentSize = salesDept.getDepartmentSize();
        System.out.println("Department Size: " + departmentSize);
    }
}
