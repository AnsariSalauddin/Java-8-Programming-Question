package in.com.Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumofFirst10NaturalNumber {
    public static void main(String[] args) {
        //first way:generat the natural number from 1 to 10
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(10);

        //second way
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);
    }
}
