package Inheritance;
//Parent
public class Person {
    String name;
    String dob;
    public Person(String name,String dob){
        this.name=name;
        this.dob=dob;
    }
    public String getdetails(){
        return "name "+name + " dob "+dob;
    }
}
