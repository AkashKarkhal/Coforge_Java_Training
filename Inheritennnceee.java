class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employeee extends Person {

    private double salary;

    public Employeee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Students extends Person {

    private String branch;

    public Students(String name, String branch) {
        super(name);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }
}

public class Inheritennnceee {

    public static void main(String[] args) {

        Employeee emp = new Employeee("Akash", 50000);
        Students stu = new Students("Rahul", "CSE");

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        System.out.println(stu.getName());
        System.out.println(stu.getBranch());
    }
}