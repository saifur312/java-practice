package lambdaexpression.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPrintListJava7 {

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
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        /** step-2: create a method that print all element in the list */
        System.out.println("print All people");
        printAll(people);

        /** step-2: create a method that print all person that have
         * last name begining with `R` */
        System.out.println("People last name start with R");
        printLastNameStartWithR(people);

        System.out.println("Print with custom condition");
        printConditionally(people, new MyCondition() {
            @Override
            public boolean test(Person p) {
                /** here I can provide any of my codition */
                return p.getLastName().startsWith("K");
            }
        });

    }

    private static void printConditionally(List<Person> people, MyCondition myCondition) {
        for (Person p : people){
            if (myCondition.test(p))
                System.out.println(p);
        }
    }

    private static void printLastNameStartWithR(List<Person> people) {
        for (Person p: people){
            if(p.getLastName().startsWith("R"))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people){
            System.out.println(p);
        }
    }
}

interface MyCondition{
    boolean test(Person p);
}
