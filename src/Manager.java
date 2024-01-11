public class Manager implements Employee{

    private String firstName;
    private int age;
    private double grossSalary;
    public Manager(String firstName, int age, double grossSalary) {
        this.firstName = firstName;
        this.age = age;
        this.grossSalary = grossSalary;
    }
    @Override
    public double getSalary() {
        return grossSalary * 0.7;
    }
    @Override
    public String info() {
        return String.format(
                "%s возраст: %d зарплата: %.2f",
                this.firstName,
                this.age,
                getSalary()
        );
    }
}