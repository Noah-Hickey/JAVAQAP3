public class CollegeStudent extends Student {

    // Attributes //
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getters //
    public String getMajor(){
        return major;
    }

    public int getYear(){
        return year;
    }

    // Setters //

    public void setMajor(String major){
        this.major = major;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}