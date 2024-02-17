package lambdaexpression;

import lambdaexpression.excercise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Saifur", "Rahman", 30),
            new Person("Anisur", "Rahman", 29),
            new Person("Rakib", "Atanu", 31),
            new Person("Partha", "Banik", 28),
            new Person("Abdul", "Kaioum", 29),
            new Person("Abdur", "Rehman", 70)
        );

        System.out.println("Iterate using stream");
        /*think stream as a conveyor belt */
        people.stream()
                .filter(p->p.getLastName().startsWith("R") && p.getAge() < 40)
                .forEach(System.out::println);

        System.out.println("Iterate using parallel stream");
        /*parallel stream enables threads to run diffrent core in parallel*/
        long countPeople = people.parallelStream()
                .filter(p->p.getFirstName().startsWith("A"))
                .count();
        System.out.println(countPeople);



    }
}
