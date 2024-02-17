package lambdaexpression;

public class ClosuresExample {

    public static void main(String [] args){
        int a=10;
        int b=20;

        /*doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i+b);
            }
        });*/

        /** this lambda will use the freezing value of b that means
         * it will use 20 if the value of b will changed or not */
        doProcess(a, i -> System.out.println(i+b));
    }

    private static void doProcess(int i, Process p) {
        p.process(i);
    }

    interface Process {
        void process(int i);
    }
}
