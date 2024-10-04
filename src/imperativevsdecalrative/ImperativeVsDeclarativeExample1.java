package imperativevsdecalrative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {
        //sum of numbers 1 -100

        /**
         * Imperative programming---->How to style
         * Here we are mutating the code, and the sum value is being continuously changed
         * When you run imperative code, for example, the code below in a multithreaded
         * environment, we may get unexpected results

         * Code is also less readable since we have to go line by line.
         * */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum using Imperative approach : " + sum);


        /**
         Declarative style of Programming---->What style of programming
         Here we ask what we want and we ride on Java Utility classes and methods.

         The below code runs as expected even in a multithreaded environment.
         We can write better code with Java8 features.
         ***/

        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel().sum();

        System.out.println("Sum using Declarative approach : " + sum1);

    }
}
