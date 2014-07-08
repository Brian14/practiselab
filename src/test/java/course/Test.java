package course;

import com.course.demo.api.DataSource;
import com.course.demo.impl.DataSourceFactory;
import com.course.demo.impl.UserData;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class Test {
    @org.junit.Test
    public void test(){
        DataSource source = DataSourceFactory.getPropertiesDataSource();
        System.out.println(source.getUserDatas());

        UserData d = new UserData();
        d.setPassword("444");
        d.setUsername("ttt");
        source.addUser(d);

        source.getUserDatas();
        System.out.println(source.getUserDatas());

        UserData d2 = new UserData();
        d.setPassword("4434");
        d.setUsername("t4tt");
        source.addUser(d);

        source.getUserDatas();
        System.out.println(source.getUserDatas());
    }
}
