package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    //Remember, we can be able to pass Functional interface implementations as inputs as well.This is one of the strengths
    //What a powerful feature, I can pass a predicate as an argument
    //This can make me very easily switch between conditions
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((studentList, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentList.forEach((student -> {
            if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {

        Map<String, Double> singlePredicateResult = biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1);
        System.out.println(singlePredicateResult);

        //We can even combine predicates (chained predicates are considered as single predicates
        Map<String, Double> chainedPredicates = biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1.and(PredicateStudentExample.p2));
        System.out.println(chainedPredicates);
    }
}
