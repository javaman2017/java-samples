package annotations;

public @interface ClassInfo {
    String created();
    String createdBy();
    String lastModified();
    String lastModifiedBy();
    Revision revision();
}
