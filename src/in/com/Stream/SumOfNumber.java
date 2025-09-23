package in.com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
        //use Lambda expression (a,b)->a+b
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        Integer integer = reduce.get();
        System.out.println("sum of Number:"+integer);

        Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);
        Integer integer1 = reduce1.get();
        System.out.println(integer1);

    }
}
