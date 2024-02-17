package lambdaexpression;

import lambdaexpression.excercise.People;
import lambdaexpression.excercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionListIteration {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Saifur", "Rahman", 30),
            new Person("Anisur", "Rahman", 29),
            new Person("Rakib", "Atanu", 31),
            new Person("Partha", "Banik", 28),
            new Person("Abdul", "Kaioum", 29),
            new Person("Abdur", "Rehman", 70)
        );

        System.out.println("print people using for loop\n**********************");
        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("\nprint people using for in loop\n**********************");
        for (Person p : people){
            System.out.println(p);
        }

        System.out.println("\n print people using lambda\n**********************");
        /*this is called internal iterator*/
        people.forEach(person -> System.out.println(person));

        System.out.println("\nprint people using method ref\n**********************");
        people.forEach(System.out::println);

        System.out.println("\nprint people using inner class implementation\n**********************");
        people.forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });
    }
}
