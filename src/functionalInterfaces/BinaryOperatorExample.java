package functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    /**Extends the BiFunction*/
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(3, 4));


        //A binary Operator has static methods minBy and maxBy
        //Which take in a Comparator
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of Max By is " + maxBy.apply(3, 4));


        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of Min By is " + minBy.apply(3, 4));

    }
}
