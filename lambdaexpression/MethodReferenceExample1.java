package lambdaexpression;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
        /** we can implement run method of Runnable interface by lambda*/
        /** Here we use lambda to execute a method
         *  This lambda has no input argument and just doing method execution
         *  */
        Thread t = new Thread(() -> printMessage());
        t.start();

        /**
         * we can do the same thing above by using method reference
         * CLassName :: methodName
         * */
        Thread t2 = new Thread( MethodReferenceExample1::printMessage );
        t2.start();

        /**
         * so this two are alternatives
         * ()->method() |||||||| CLassName::methodName
         * */


    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
