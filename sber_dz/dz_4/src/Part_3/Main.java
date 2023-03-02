package Part_3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> str = List.of("abc", "", "", "def", "qqq");
        System.out.println(delEmpty(str));

    }

    private static long delEmpty(List<String> str){
        return str.stream()
                .filter(item -> !item.equals(""))
                .count();
    }
}
