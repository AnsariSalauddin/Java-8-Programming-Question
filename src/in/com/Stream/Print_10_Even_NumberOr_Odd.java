package in.com.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Print_10_Even_NumberOr_Odd {
    public static void main(String[] args) {
        int[] array = IntStream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 0).limit(10).toArray();
//        Arrays.stream(array).forEach(System.out::println);

        int[] array1 = IntStream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 != 0).limit(10).toArray();
        Arrays.stream(array1).forEach(System.out::println);
    }
}
