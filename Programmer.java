public class Programmer extends Employee {
    String ProgramLanguage;
    Double HourlyRate;
    // Constructor
    public Programmer(String name, String employeeID, Double salary, Float employeeSalaryPerYear, String programLanguage, Double hourlyRate)
    {
        super(name, employeeID, salary, employeeSalaryPerYear);
        ProgramLanguage = programLanguage;
        HourlyRate = hourlyRate;
    }
    // Getter & Setter


    public String getProgramLanguage() {
        return ProgramLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        ProgramLanguage = programLanguage;
    }

    public Double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        HourlyRate = hourlyRate;
    }
}
