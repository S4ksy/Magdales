package Management_Exc;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        if (salary < 30000) {
            throw new IllegalArgumentException("Salary must be greater than or equal to 30000");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is working");
    }
}
