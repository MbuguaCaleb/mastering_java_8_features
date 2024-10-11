package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " :" + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        //When that one thing does a number of things i can use a bi-consumer instead of chaining
        //instead of chaining two consumers if i have two Operations that need to be done, i can use a bi-consumer
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        //Takes in Two Inputs and we can perform Operations on the two Inputs
        BiConsumer<String,String> biConsumer = (a, b) ->{
            System.out.println("a :" + a + " b :" + b);
        };

        BiConsumer<Integer,Integer> multiply = (a, b) ->{
            System.out.println("Multiplication is " + (a*b));
        };

        BiConsumer<Integer,Integer> division = (a, b) ->{
            System.out.println("Division is " + (a/b));
        };

        biConsumer.accept("java7","java8");
        multiply.andThen(division).accept(10,5);
        nameAndActivities();
    }
}
