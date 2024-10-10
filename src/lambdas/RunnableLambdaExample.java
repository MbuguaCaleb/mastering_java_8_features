package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior to Java 8
         * (With runnable we are creating an anonymous class)
         * */
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable interface 1");
            }
        };
         new Thread(runnable).start();

         /*
         * After Java 8
         * Every lambda function under the hood is a runnable since it runs
         * without instantiation
         * () -> {}
         * */

        Runnable runnableLambda = () ->{
            System.out.println("Inside runnable interface 2");
        };


        //simplifying the Lambda even further
        Runnable simplifiedLambda = () -> System.out.println("Even Simplified Lambda");

        new Thread(runnableLambda).start();
        new Thread(simplifiedLambda).start();

        //We can even pass the runnable lambda directly inside the thread
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Inside Runnable 3.1");
                    }
                }
        ).start();


        //Simplified Further using Lambdas
        new Thread(()-> System.out.println("inside unnable 3.2")).start();
        Runnable moreThanOneExpression = () ->{
            System.out.println("Inside Runnable One");
            System.out.println("Inside Runnable Two");
        };

        new Thread(moreThanOneExpression).start();
     }
}
