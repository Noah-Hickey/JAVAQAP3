
public class Teacher extends Person{
    
    // Atrributes //
    protected String subject;
    protected double salary;

    // Constructors //
    public Teacher(String name, int age, String subject, double salary, String gender){
        super(name,age,gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters //
    public String getSubject(){
        return subject;
    }

    public double getSalary(){
        return salary;
    }

    // Setters //
    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override 
    public String toString(){
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}
