package lambdaexpression;

import lambdaexpression.excercise.Person;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
            new Person("Saifur", "Rahman", 30),
            new Person("Anisur", "Rahman", 29),
            new Person("Rakib", "Atanu", 31),
            new Person("Partha", "Banik", 28),
            new Person("Abdul", "Kaioum", 29),
            new Person("Abdur", "Rehman", 70)
    );


        System.out.println("print All people\n*******************************");
        //performConditionally(people, p-> true, p-> System.out.println(p));
        /**
         * we can replace 2nd lambda by Method Reference
         * but the question is how compiler will know that this
         * method reference will accept an input argument?
         * well, this mr replacing the Consumer Interface and that
         * interface abstract method will accept an input argument.
         * thus compiler will accept our mr as correct
         * */

        /* Since println method is of PrintStream class
        * adn out is the static instance of System class that
        * has PrintStream as its type so we need to use
        * double colon (::) after the instance field */
        performConditionally(people, p-> true, System.out::println);
    }

    /*make this method perform any action based on condtion*/
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people){
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

}



