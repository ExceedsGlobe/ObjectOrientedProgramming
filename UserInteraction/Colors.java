package UserInteraction;

public class Colors {
    public static void main(String args[]){
        String color="red,blue,green,yellow,white";
        //Splits the string by , and stores it in array
       String[] colors= color.split(",");
       //For each loop Iterate over the loop
       for (String clr:colors){
           System.out.println(clr);
       }
       for ( int i=0;i<colors.length;i++){
           System.out.println(colors[i]);
       }

    }
}
