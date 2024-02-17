package lambdaexpression.excercise;

import java.util.List;
import java.util.Arrays;
public class People {

    public static void main(String[] args) {
        List people = Arrays.asList(
            new Person("Saifur", "Rahman", 30),
            new Person("Anisur", "Rahman", 29),
            new Person("Rakib", "Atanu", 31),
            new Person("Partha", "Banik", 28),
            new Person("Abdul", "Kaioum", 29),
            new Person("Abdur", "Rehman", 70)
        );

        System.out.println(people);
    }
}
