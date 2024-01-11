public class Programmer implements Employee {
    private String firstName;
    private String lastName;
    private double grossSalary;
    public Programmer(String firstName, String lastName, int grossSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSalary = grossSalary;
    }
    @Override
    public double getSalary() {
        return grossSalary * 1.1;
    }
    @Override
    public String info() {
        return String.format("%s %s (%.2f)", this.firstName, this.lastName, getSalary());
    }
}