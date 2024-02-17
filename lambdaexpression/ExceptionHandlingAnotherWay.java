package lambdaexpression;

import java.util.function.BiConsumer;

public class ExceptionHandlingAnotherWay {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int key = 0;

        process(numbers, key, wrapper((v, k) -> System.out.println(v/k)));
    }

    private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> biConsumer) {
        return (val, key) -> {
            try {
                biConsumer.accept(val, key);
            }catch (ArithmeticException e){
                System.out.println("Exception from wrapper");
            }
        };
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : numbers)
           biConsumer.accept(i, key);
    }
}
