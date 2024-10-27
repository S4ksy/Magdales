package Management_Exc;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void giveRaise(List<Person> persons, String manager, String employee, double salary) {
        Manager mgr = null;
        Employee emp = null;

        for (Person person : persons) {
            if (person.getName().equals(manager)) {
                if (person instanceof Manager) {
                    mgr = (Manager) person;
                } else {
                    throw new ClassCastException(manager + " is not a Manager");
                }
            }
            if (person.getName().equals(employee)) {
                if (person instanceof Employee) {
                    emp = (Employee) person;
                } else {
                    throw new ClassCastException(employee + " is not an Employee");
                }
            }
        }

        if (mgr == null) throw new NoSuchElementException(manager + " does not exist");
        if (emp == null) throw new NoSuchElementException(employee + " does not exist");
        if (salary < 0) throw new IllegalArgumentException("Salary must be non-negative");

        mgr.giveRaise(emp, salary);
    }

    public static void assignPM(List<Person> persons, String developer, String manager) {
        Developer dev = null;
        Manager mgr = null;

        for (Person person : persons) {
            if (person.getName().equals(developer)) {
                if (person instanceof Developer) {
                    dev = (Developer) person;
                } else {
                    throw new ClassCastException(developer + " is not a Developer");
                }
            }
            if (person.getName().equals(manager)) {
                if (person instanceof Manager) {
                    mgr = (Manager) person;
                } else {
                    throw new ClassCastException(manager + " is not a Manager");
                }
            }
        }

        if (dev == null) throw new NoSuchElementException(developer + " does not exist");
        if (mgr == null) throw new NoSuchElementException(manager + " does not exist");

        dev.setProjectManager(mgr);
    }

    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Customer cust = null;
        Employee emp = null;

        for (Person person : persons) {
            if (person.getName().equals(customer)) {
                if (person instanceof Customer) {
                    cust = (Customer) person;
                } else {
                    throw new ClassCastException(customer + " is not a Customer");
                }
            }
            if (person.getName().equals(employee)) {
                if (person instanceof Employee) {
                    emp = (Employee) person;
                } else {
                    throw new ClassCastException(employee + " is not an Employee");
                }
            }
        }

        if (cust == null) throw new NoSuchElementException(customer + " does not exist");
        if (emp == null) throw new NoSuchElementException(employee + " does not exist");

        return cust.speak(emp);
    }
}
