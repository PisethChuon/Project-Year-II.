public class Manager extends Employee {
    String Department;
    Double BonusPercentage;
    // Constructor
    public Manager(String name, String employeeID, Double salary, Float employeeSalaryPerYear, String department, Double bonusPercentage) {
        super(name, employeeID, salary, employeeSalaryPerYear);
        Department = department;
        BonusPercentage = bonusPercentage;
    }
    // Getter & Setter

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Double getBonusPercentage() {
        return BonusPercentage;
    }

    public void setBonusPercentage(Double bonusPercentage) {
        BonusPercentage = bonusPercentage;
    }
}
