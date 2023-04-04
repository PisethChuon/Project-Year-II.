public class Employee {
    String Name;
    String EmployeeID;
    Double Salary;
    Float EmployeeSalaryPerYear;
    int Percentage = 5;

    // Constructor of Employee

    public Employee(String name, String employeeID, Double salary, Float employeeSalaryPerYear)
    {
        Name = name;
        EmployeeID = employeeID;
        Salary = salary;
        EmployeeSalaryPerYear = employeeSalaryPerYear;
    }


    // Create getter & setter


    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getEmployeeID()
    {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID)
    {
        EmployeeID = employeeID;
    }

    public Double getSalary()
    {
        return Salary;
    }

    public void setSalary(Double salary)
    {
        Salary = salary;
    }

    public Float getEmployeeSalaryPerYear()
    {
        return EmployeeSalaryPerYear;
    }

    public void setEmployeeSalaryPerYear(Float employeeSalaryPerYear)
    {
        EmployeeSalaryPerYear = employeeSalaryPerYear;
    }
}
