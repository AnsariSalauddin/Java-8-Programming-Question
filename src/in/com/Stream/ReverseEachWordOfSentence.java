package in.com.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfSentence {
    public static void main(String[] args) {
        String str="i love my india";
        String collect = Arrays.stream(str.split(" ")).
                map(x -> new StringBuilder(x).reverse().
                        toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
