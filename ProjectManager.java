import java.util.ArrayList;

public class ProjectManager {
    ProjectManager project;
    ArrayList<Employee> objEmployee;
    Double getTotalSalary;

    // Constructor
    public ProjectManager(ProjectManager project, ArrayList<Employee> objEmployee) {
        this.project = project;
        this.objEmployee = objEmployee;
    }

    public Double getGetTotalSalary()

    {
        return getTotalSalary;
    }

    public void setGetTotalSalary(Double getTotalSalary) {
        this.getTotalSalary = getTotalSalary;
    }
}
