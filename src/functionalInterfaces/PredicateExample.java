package functionalInterfaces;
import java.util.function.Predicate;

public class PredicateExample {
    //The predicate functional interface returns boolean true or false
    //in addition to returning the boolean expression, we have the and, negate and or
    //The biggest advantage of the predicate is re-usablity

    static Predicate<Integer> p1 = integer -> integer % 2 == 0;
    static Predicate<Integer> p2 = integer -> integer % 5 == 0;

    public static void predicateAnd(){
        System.out.println("Predicate and result is : " + p1.and(p2).test(10)); // predicate chaining
        System.out.println("Predicate and result two is : " + p1.and(p2).test(9)); // predicate chaining
    }

    public static void predicateOr(){
        System.out.println("Predicate and result is : " + p1.or(p2).test(10)); // predicate chaining
        System.out.println("Predicate and result is : " + p1.or(p2).test(12)); // predicate chaining
    }

    public static void predicateNegate(){
        System.out.println("Predicate Negate result is : " + p1.or(p2).negate().test(8)); // predicate chaining
    }

    public static void main(String[] args) {
        System.out.println(p1.test(5));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
