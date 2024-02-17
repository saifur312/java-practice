package lambdaexpression;

public class ThisReferenceExample {

    private void doProcess(int i, ClosuresExample.Process p) {
        p.process(i);
    }

    private void execute(){
        doProcess(10, i -> {
            System.out.println("value of i " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(100, new ClosuresExample.Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is anonymous inner class";
            }
        });


        thisReferenceExample.execute();
    }

    public String toString(){
        return "This is ThisReferenceExample class";
    }
}
