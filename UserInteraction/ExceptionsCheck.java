package UserInteraction;

public class ExceptionsCheck {
    public static void main(String args[]){
       //Handling exceptions
        try{
            int result=10/0;
            //Eliminates the above statement jumps to catch statement
            System.out.println(result);
        }

//Focus shift here if exception occured
        catch (ArithmeticException| NullPointerException e){
            System.out.println("Program crashed");
        }
        catch (Exception e){
            System.out.println();
        }
        //Will be executed regardless the exception occured or not
        finally {
            System.out.println("Program closed");
        }
    }
}
