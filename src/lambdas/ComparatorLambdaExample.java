package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
         *Prior to Java 8(Implementation of Comparator Interface was being
         * done as follows, prior to Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 when Equals, 1 when greater, -1 when Less Than
            }
        };

        System.out.println("Result of Comparator is:" + comparator.compare(3,2));

        /*
         * After Java 8 (This is how we can easily do an Implementation of Comparator
         * */
        Comparator<Integer> comparatorTwo  = (Integer a, Integer b) ->  a.compareTo(b);
        System.out.println("Result of Comparator is:" + comparatorTwo.compare(13,23));


        //Even more Simplified (it will infer integer to what its taking in
        Comparator<Integer> comparatorThree  = ( a, b) ->  a.compareTo(b);
        System.out.println("Result of Comparator is:" + comparatorThree.compare(13,13));

    }
}
