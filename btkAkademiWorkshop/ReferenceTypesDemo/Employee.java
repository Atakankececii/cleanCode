package ReferenceTypesDemo;

public class Employee extends Person{
    private double salary;


    public Employee(){

    }

    public Employee(int id, String firstName, double salary) {
        super(id, firstName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
