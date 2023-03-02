package Part_5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> str = List.of("abc", "def", "qqq");
        toUpperCase(str);
    }

    private static void toUpperCase(List<String> str){
        System.out.println(str.stream()
                        .map(item -> item.toUpperCase())
                        .collect(Collectors.joining(", ")));
    }
}
