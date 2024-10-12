package functionalInterfaces;

public class FunctionExampleOne {

    public static String performConcat(String str) {
        //Importing my created functional inteface
        return FunctionExample.addSomeString.andThen(FunctionExample.function).apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println("Result : " + result);
    }
}
