package Inheritance;

public class Room {
    final int NOOFWINDOWS=1;
    int length;
    int breath;
    //Final to restrict overriding
public final int getArea(){

    return length*breath;
}
}
