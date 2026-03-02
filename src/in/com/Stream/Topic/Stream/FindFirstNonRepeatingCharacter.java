package in.com.Stream.Topic.Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="aabbcdde";
        Character c = str.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(c);
    }
}
