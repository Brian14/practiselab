package testGuava.predicate;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import testGuava.objects.Person;

import java.util.Iterator;
import java.util.List;

/**
 * User: bao
 * Date: 2014/8/26
 */
public class TestPredicate {

    List<Person> personList;

    Predicate<Person> agePredicate = new Predicate<Person>() {
        @Override
        public boolean apply(Person input) {
            boolean older = false;
            if (input.getAge() > 30) {
                older = true;
            }
            return older;
        }
    };

    @Before
    public void setup() {
        Person p1 = new Person("aaabc", 15, true);
        Person p2 = new Person("aaxyz", 25, false);
        Person p3 = new Person("cccas", 35, true);
        Person p4 = new Person("ffff", 45, false);
        Person p5 = new Person("cccedd", 55, true);
        personList = Lists.newArrayList(p1, p2, p3, p4, p5);

    }

    @Test
    public void testPredict() {
        Iterator<Person> o = Iterators.filter(personList.iterator(),agePredicate);

        while (o.hasNext()){
            System.out.println(o.next().getName());
        }


    }

}
