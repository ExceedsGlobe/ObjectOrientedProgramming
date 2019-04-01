package Inheritance;

public class Teacher extends Person {
    int yop;
    public Teacher(String name, String dob, int yop) {
        super(name,dob);
        this.yop=yop;
    }

    @Override
    public String getdetails() {
        return super.getdetails()+"\nYears of Experience "+yop;
    }
}
