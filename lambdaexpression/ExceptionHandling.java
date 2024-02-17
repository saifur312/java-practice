package lambdaexpression;

import java.util.function.BiConsumer;

public class ExceptionHandling {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int key = 0;

        process(numbers, key, (v, k) -> {
            try {
                System.out.println(v/k);
            }catch (ArithmeticException exception){
                System.out.println(exception);
            }
        });
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers)
           biConsumer.accept(i, key);
    }
}
