package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    /*A function that converts studentsList into a hashMap
     (Converting a ListInto a dictionary)
     * */

    static Function<List<Student>, Map<String, Double>> studentFunction = (studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        //Putting the studentInformation into a Map
        studentList.forEach((student -> studentGradeMap.put(student.getName(), student.getGpa())));
        return studentGradeMap;
    });

    static Function<List<Student>, Map<String, Double>> studentFunctionGreaterThanGradeLevelThree = (studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentList.forEach((student -> {
            //filtering students with GPA > 3
            //When the student passes the predicate condition
            if (PredicateStudentExample.p1.test(student)){
                studentGradeMap.put(student.getName(), student.getGpa());
            }

        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {

        System.out.println("Original List");
        System.out.println(StudentDataBase.getAllStudents());


        System.out.println("Original List with hashmap");
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

        System.out.println("condition applied before HashMap");
        System.out.println(studentFunctionGreaterThanGradeLevelThree.apply(StudentDataBase.getAllStudents()));

    }
}