package EmployeeManager;

public class Manager extends Employee {
    private String department;
    private double bonus;


    public Manager(String firstName, String lastName, String email, double salary, String department, double bonus) {
        super(firstName, lastName, email, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + getSalary() +
                ", department='" + department + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}

