package encapsulation_practic;

public class Empolyee {

    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("Invalid salary");
            System.exit(0);
        }

        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Empolyee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
