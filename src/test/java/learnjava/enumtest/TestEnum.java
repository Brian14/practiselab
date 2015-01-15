package learnjava.enumtest;

import org.junit.Test;

/**
 * User: BAOBR
 * Date: 11/4/14
 */
public class TestEnum {

    enum Transport {
        CAR, TRUCK, TRAIN, BOAT, AIRPLANE
    }


//    enum AnotherTransport{
//
//        CAR{
//            public AnotherTransport CAR(){
//
//            }
//
//        },
//        Truck{
//
//        }
//
//
//    }

    @Test
    public void test1() {
        Transport new1 = Transport.BOAT;

        //使用枚举变量
        System.out.println(new1);
        System.out.println(Transport.AIRPLANE);

        //用 == 进行比较
        System.out.println(new1 == Transport.AIRPLANE);
        System.out.println(new1 == Transport.BOAT);

    }


    @Test
    public void test2() {
        Transport TransArray[] = Transport.values();

        for (Transport tr : TransArray) {
            System.out.println(tr);
        }


    }


}
