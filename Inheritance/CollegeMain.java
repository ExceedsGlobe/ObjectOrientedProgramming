package Inheritance;

public class CollegeMain {
    public static void main(String args[]){
        Person student=new Student("Tim","18/9/1999",7);
        Person teacher=new Teacher("Paul","07/8/1989",4);

        System.out.println(teacher.getdetails());
    }
}
