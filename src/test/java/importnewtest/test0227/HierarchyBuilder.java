package importnewtest.test0227;

/**
 * User: BAOBR
 * Date: 2/27/15
 */
public class HierarchyBuilder {
    private HierarchyBuilder() {
        super();
    }

    public static Hierarchy buildHierarchy(final String clzzName) throws ClassNotFoundException {
        //反射
        final Class clazz = Class.forName(clzzName, false, HierarchyBuilder.class.getClassLoader());

        return buildHierarchy(clazz);
    }

    public static Hierarchy buildHierarchy(Class clazz) {
        if (clazz == null) {
            throw new RuntimeException("Class parameter can not be null");
        }
        //看看这些类是怎么被使用的
        final Hierarchy hier = new Hierarchy();
        hier.setBaseClass(clazz);
        final Class supperClass = clazz.getSuperclass();
        if (supperClass != null && supperClass.getName().equals("java.lang.Object")) {
            return hier;
        } else {
            while ((clazz.getSuperclass() != null) && (!supperClass.getName().equals("java.lang.Object"))) {
                clazz = clazz.getSuperclass();
                hier.addClass(clazz);
            }
            return hier;
        }
    }

}
