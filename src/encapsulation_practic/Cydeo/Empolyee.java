package encapsulation_practic.Cydeo;

public class Empolyee extends Person{

    private int ID;
    private String jobTitle;
    private double salary;

    public Empolyee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public void work(){
        System.out.println(getName()+ " is working");
    }


    public String toString() {
        return "Empolyee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*2. Create a sub class of Person named Employee:
        Extra variables:
        employeeId, jobTitle, salary

        Encapsulate all the fields

        Add a constructor to set all the fields

        Methods:
        work()
        toString()

 */