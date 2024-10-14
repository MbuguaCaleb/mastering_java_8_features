package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    //Extansion of the function and is used in scenerios where the Input and the OutPut
//    are of the same Type
    static UnaryOperator<String> unaryOperator = (s -> s.concat("Default"));

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
