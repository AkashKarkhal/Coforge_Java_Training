import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet_Example {

    public static void main(String[] args) {

        LinkedHashSet<Employee> employees = new LinkedHashSet<>();

        employees.add(new Employee("Akash", 105, 35000));
        employees.add(new Employee("Rahul", 102, 40000));
        employees.add(new Employee("Priya", 110, 42000));
        employees.add(new Employee("Sneha", 101, 39000));
        employees.add(new Employee("Vikas", 108, 50000));
        employees.add(new Employee("Rohit", 106, 37000));
        employees.add(new Employee("Anjali", 109, 45000));
        employees.add(new Employee("Neha", 104, 41000));
        employees.add(new Employee("Karan", 103, 55000));
        employees.add(new Employee("Amit", 107, 48000));

        LinkedList<Employee> list = new LinkedList<>(employees);

        Collections.sort(list, Comparator.comparingInt(Employee::getEid));

        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}