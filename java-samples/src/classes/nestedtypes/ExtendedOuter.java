package classes.nestedtypes;

public class ExtendedOuter extends Outer {
    public class ExtendedInner extends Inner {  
        public void g(){
            super.f();
        }
    }
    Inner ref = new ExtendedInner();
    public Inner getRef(){
        return ref;
    }
    
    public static void main(String[] args){
        ExtendedOuter extendedOuter = new ExtendedOuter();
        ExtendedOuter.ExtendedInner extendedInnerRef = (ExtendedOuter.ExtendedInner)extendedOuter.getRef();
        extendedInnerRef.g();
    }
   
}

