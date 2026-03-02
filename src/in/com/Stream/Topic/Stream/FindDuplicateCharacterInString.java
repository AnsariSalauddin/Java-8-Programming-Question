package in.com.Stream.Topic.Stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "salauddin";

        List<Character> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        x->x,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(x->x.getKey())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
