package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        //It does not take any Input but returns an OutPut.
        //Direcly Opposite to a Consumer
        /**Imagine  having a whole class instance instantiation in a variable**/

        Supplier<Student>  studentSupplier = () -> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        System.out.println("Student is :" + studentSupplier.get());


        //Supplying a List of Students via the Supplier

        Supplier<List<Student>> listStudentsSupplier  = () -> StudentDataBase.getAllStudents();
        System.out.println("The Students List is :" +  listStudentsSupplier.get());
    }
}
