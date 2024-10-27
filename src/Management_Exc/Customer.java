package Management_Exc;

public class Customer extends Person {

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is browsing through");
    }

    public String speak(Employee employee) {
        if (employee == null) {
            return null;
        }

        if (employee instanceof Developer && this.getAge() > employee.getAge()) {
            Developer dev = (Developer) employee;
            if (dev.getProjectManager() != null) {
                return "Can I see your manager " + dev.getProjectManager().getName() + "?";
            }
        }
        return "Oh, hello, " + employee.getName() + ". Can you assist me?";
    }
}
