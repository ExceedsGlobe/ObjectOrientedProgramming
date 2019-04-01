package Inheritance;

public class Student extends Person{
   public  int standard;
    public Student(String name,String dob,int standard){
        super(name,dob);
        this.standard=standard;

    }

    @Override
    public  String getdetails(){
        return super.getdetails()+ " \nStandard "+standard;
    }
}
