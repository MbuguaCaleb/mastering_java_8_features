package imperativevsdecalrative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {
        //Remove duplicates from an Integer List and have the list with unique values

        List<Integer> integerList = Arrays.asList(1,2,3,3,4,4,5,6,7,7,8,9,9,10);

        /**
         * Imperative Approach
         * The functions in Java 8 will take care of findinding the distinct values
         * or any other Operation which i may desire.
         **/

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer: integerList){
            if(!uniqueList.contains(integer)){
               uniqueList.add(integer);
            }
        }

        System.out.println("Unique List 1 : " + uniqueList);

        /**
         * Declarative Approach
         * (we call the appropriate functions based on our use case and they
         * (give us results)
         **/

       List<Integer> uniqueResultsTwo= uniqueList.stream().parallel().toList();
        System.out.println("Unique List 2 : " + uniqueResultsTwo);
    }
}
