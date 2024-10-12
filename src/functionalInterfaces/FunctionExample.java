package functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    /**
     * (a)I must define the input and output of the function as i create a functional interface
     Much that it can be passed around it does not loose the functionality of a regular function
     (It has a return type)

     (b)Functions I create via functional interfaces are meant to be used globally in my Project

     */
    static Function<String, String> function = name -> name.toUpperCase();
    static Function<String, String> addSomeString = name -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is :" + function.apply("java8"));

        /**
         --->And then is used when i want to perform another action after my first action
         Maybe i may want to run two separate functions
         -->In the declarative way of programming i use andthen to chain function operations
         -->and then executes the functions in the order mentioned
         -->we can chain as many number of and thens as we would wish in our useCase
         **/
        System.out.println("Result of and then is :" + function.andThen(addSomeString).apply("java8"));


        /**
         * ---->Compose does the execution in the reverse order
         *
         * */
        System.out.println("Result of and then is :" + function.compose(addSomeString).apply("java8"));


    }
}
