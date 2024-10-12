package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    //Lambda behaves the same irrespective of an instance method or a static method

    //The Strength of a predicate is in returning true or false based on conditions
    Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

    /*A bi-predicate gives me the power to evaluate two conditions that return true or false
    at once*/
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> studentListBiConsumer = (name, activities) -> System.out.println(name + ":" + activities);

    //I can be able to use my predicates inside my consumer
    Consumer<Student> studentConsumer = (student -> {
        //I have the control to do whatever Operations I want to in a consumer
        //When I want to call the implementation in my consumer I just call accept
        if (p1.and(p2).test(student)) {
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    /*Instead of Nesting two things that return true or false we can use bi-predicate*/
    /*When i have a use case where i need to evaluate two things that return true or */
    Consumer<Student> studentConsumerBiPredicate = (student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
        studentList.forEach(studentConsumerBiPredicate);
    }

}
