// SalesDepartment.java
public class SalesDepartment extends Department {
    private final int departmentSize;

    public SalesDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    public int getDepartmentSize() {
        return departmentSize;
    }
}
