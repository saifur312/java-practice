package lambdaexpression;
public class LamdaExpression {

    //public TestLamda testLambda = public void test () {System.out.println("Yes I m a lamda");}
    public static void main(String[] args) {
        /**
         * we can not store function into any variable or instance of an interface like this way
         * **/
        /* TestLamda testLambda = public void test() {
            System.out.println("Yes I m a lamda");
        }*/
        /**
         * but we can store lambda expression into an instance of Interface.
         * Lambda will work as an implementation of the method of corresponding Interface
         * The corresponding type interface should contain only one method
        */
        MyFirstLambda myFirstLambda = () -> System.out.println("This is my First lamda expression");
        myFirstLambda.test();

        /** using lambda as arguments*/
        LamdaExpression lamdaExp = new LamdaExpression();
        lamdaExp.greet(() -> System.out.println("Greeting from Saifur"));

        /** using one parameter lambda */
        LengthCount lengthCount = (s) -> s.length();
        System.out.println("Length " + lengthCount.countLength("Billu likes Xoxo"));

        /** using one parameter lambda implementation as parameter */
        lamdaExp.printStringLength(s -> s.length());


        /** using one parameter lambda by shortened version*/
        MoneyDouble moneyDouble = m -> m * 2;
        System.out.println("Double of 100 " + moneyDouble.makeDouble(100));

//        LengthCount lengthCount = new LengthCountImpl();
//        lengthCount.countLength("I m saifur");

        /** lamda with thread runnable interface to understand that
         *  why lambda should use interface as its type.
         *  First we use Runnable inner class then we do same thing using lambda
         *  */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread from runnable");
            }
        });
        thread.run();

        /** now we use lamda to do same like above */
        Thread threadLamda = new Thread( () -> System.out.println("Thread from lamda"));
        threadLamda.run();
    }
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public void printStringLength(LengthCount lengthCount){
        System.out.println("printStringLength " + lengthCount.countLength("SAIFUR sha"));
    }
}

interface MyFirstLambda{
    public void test();
}

interface LengthCount { int countLength(String s);}
interface MoneyDouble{ public int makeDouble(int money);}

/* an implementation of LengthCount Interface*/
class LengthCountImpl implements LengthCount{
    @Override
    public int countLength(String s) {
        return s.length();
    }
}

interface Greeting { void perform();}
