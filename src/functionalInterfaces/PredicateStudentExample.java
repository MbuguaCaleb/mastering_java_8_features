package functionalInterfaces;
import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    /***
     (a)Creating a Predicate which when its given a Student, it will return to true if studentGradeLevel >=3

     (b)Having predicates, I am having certain defined pre-conditions, then I invoke them at will
     This is way cleaner code than having my logic in the code

     (c)If we use predicates in our Utility classes, we can avoid code duplication in a very intelligent way.
     Predicates are called and invoked in a much cleaner fashion.
     ***/
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {
        System.out.println("Filtered students by the grade level");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            //When the condition is true that is when i will print a student
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGpa() {
        System.out.println("Filtered students by the GPA");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            //When the condition is true that is when i will print a student
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGpaAndGradeLevel() {
        System.out.println("Filtered students by the GPA & Grade Level");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            //When the condition is true that is when i will print a student
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });
    }


    /**
     * Woow, if i want students who do not march these conditions i just negate
     * In imperative approach i would have been forced to create a whole new method
     * **/
    public static void filterStudentsByGpaAndGradeLevelNotMarchingCondition() {
        System.out.println("Filtered students by the GPA & Grade Level not Marching condition");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            //When the condition is true that is when i will print a student
            if (p1.and(p2).negate().test(student)) {
                System.out.println(student);
            } else {
                System.out.println(student);
            }

        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudentsByGpaAndGradeLevel();
        filterStudentsByGpaAndGradeLevelNotMarchingCondition();
    }
}
