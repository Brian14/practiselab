package importnewtest.test0227;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * User: BAOBR
 * Date: 2/27/15
 */
public class Hierarchy {
    private Collection classes;
    //给反射用的
    private Class baseClass;


    public Hierarchy() {
        super();
        this.classes = new ArrayList();
    }

    public void addClass(final Class clazz) {
        this.classes.add(clazz);
    }


    public String[] getHierarchyClassNames() {
        final String[] names = new String[this.classes.size()];
        int x = 0;
        //iterator的循环还可以这么写
        for (Iterator iter = this.classes.iterator(); iter.hasNext(); ) {
            Class clazz = (Class) iter.next();
            names[x++] = clazz.getName();
        }
        return names;
    }

    public Class getBaseClass() {
        return baseClass;
    }

    public void setBaseClass(final Class baseClass) {
        this.baseClass = baseClass;
    }

}
