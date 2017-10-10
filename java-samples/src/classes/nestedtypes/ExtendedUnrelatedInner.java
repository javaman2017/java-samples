package classes.nestedtypes;

public class ExtendedUnrelatedInner extends Outer.Inner {
    public ExtendedUnrelatedInner(Outer ref) {
        ref.super();
    }
}
