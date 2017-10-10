package exceptions;

class SuperException extends Exception {}
class SubException extends SuperException {}

public class BadCatch {
    public void goodTry(){
        try{
            throw new SubException();
        } catch(SuperException superRef) {
            
        } //catch (SubException subRef) {  //Gets flagged as unreachable
//            
//        }
    }
}
