package lambdaexpression.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaWithFunctionInterface {

    public static void main(String[] args) {
        List people = Arrays.asList(
                new Person("Saifur", "Rahman", 30),
                new Person("Anisur", "Rahman", 29),
                new Person("Rakib", "Atanu", 31),
                new Person("Partha", "Banik", 28),
                new Person("Abdul", "Kaioum", 29),
                new Person("Abdur", "Rehman", 70)
        );

        /** step-1: sort list by last name */
        //Collections.sort(people, (Comparator<Person>) (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        Collections.sort(people, (Comparator<Person>) (p1, p2) ->
                p1.getLastName().compareTo(p2.getLastName()));



        /** step-2: print all element in the list */
        System.out.println("print All people\n*******************************");
        performConditionally(people, p-> true, p-> System.out.println(p));



        /** step-3: print all person that have
         * last name begining with `R` */
        System.out.println("\nPeople last name start with R\n*******************************");
        performConditionally(people, p ->  p.getLastName().startsWith("R"),
                p-> System.out.println(p.getLastName()));



        /** step-4:  print all person that passes a custom condition */
        System.out.println("\nPrint that matches firstName with A\n*******************************");
        performConditionally(people, p -> p.getFirstName().startsWith("A"), p-> System.out.println(p));

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
