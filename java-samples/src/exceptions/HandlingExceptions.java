package exceptions;

public class HandlingExceptions {

    public static void main(String[] args) {
        HandlingExceptions.finallyWithReturn();
        HandlingExceptions.finallyWithNormalExecution();
        HandlingExceptions.finallyAfterCatchClause();
        HandlingExceptions.handlingViaOuterTry();
    }
    
    static void finallyWithReturn(){
        try{
            System.out.println("Inside try block");
            return;
        } finally {
            System.out.println("Inside finally block");
            System.out.println();
            System.out.println();
        }
    }
    
    static void finallyWithNormalExecution(){
        try{
            System.out.println("Inside try block");
            int i = 1;
            int j = 1;
            System.out.println("i + j = " + (i + j));
        } finally {
            System.out.println("Inside finally block");
            System.out.println();
            System.out.println();
        }
    }
    
    static void finallyAfterCatchClause(){
        try{
            System.out.println("Inside try block");
            throw new Exception("Thrown exception");
        } catch (Exception e){
            System.out.println("Inside catch clause. Exception msg: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
            System.out.println();
            System.out.println();
        }
    }
    
    static void handlingViaOuterTry(){
        try{
            try{
                System.out.println("Inner try block");
                throw new IllegalArgumentException("Thrown exception from inner try");
            } catch (NullPointerException ne){
            } finally {
                System.out.println("Inner finally block");
            }
        } catch (IllegalArgumentException iae){
            System.out.println("Outer catch clause. Exception msg: " + iae.getMessage());
            System.out.println();
            System.out.println();
        }
    }

}
