package in.com.Stream;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        double asDouble = list.stream().mapToInt(a -> a).average().getAsDouble();
        System.out.println(asDouble);

    }
}
