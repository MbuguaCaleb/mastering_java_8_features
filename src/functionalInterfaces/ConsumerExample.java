package functionalInterfaces;


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**When I use functional interfaces, I can write my code declaratively
     Command a consumer to give me what I want & I can chain consumers
     A consumer and bi-consumer does not have a return value.
     They just do the Operations Commanded*/

    static Consumer<Student> c2 = student -> System.out.println(student);
    static Consumer<Student> studentName = student -> System.out.print(student.getName());
    static Consumer<Student> studentActivities = student -> System.out.println(student.getActivities());

    /*Real World example for the use of Consumer Interface*/
    public static void printName() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //even a foreach loop takes in a consumer
        //Each iteration loop returns a consumer which i can command to do what i desire
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities()");
        //consumer Operation that getsName of the Student
        //i am commanding the consumer to do what i want it to do
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentName.andThen(studentActivities)); // consumer chaining

        /**When i want to do two separate things for a consumer in an Object,i can create two separate consumers and chain the Output
         so thing previous way (imperatively**/
        /*
        studentList.forEach(student->{
            System.out.println(student.getName());
            System.out.println(student.getActivities());
        });
        */
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition()");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                //code reusability
                //i am reusing the consumer for printing the name and printing the activities
                //Here i am creating a consumer inside my forLoop therefore i must use accept
                studentName.andThen(studentActivities).accept(student);
            }
        });

    }

    public static void main(String[] args) {
        //Functional Interfaces help me do things Declaratively
        /*
         * Performing an Uppercase Operation
         */
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }


}
