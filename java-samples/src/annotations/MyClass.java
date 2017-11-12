package annotations;

@ClassInfo(created = "666",
           createdBy = "Mr T",
           lastModified = "665",
           lastModifiedBy = "Mr T",
           revision = @Revision(major = 4))
@BugsFixed({"123","456"})
public class MyClass {
    private int i;
}
