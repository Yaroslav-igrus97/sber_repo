package Part_6;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Set<Set<Integer>> mySet = Set.of(Set.of(0, 1, 2), Set.of(3, 4, 5), Set.of(6, 7, 8));
        System.out.println(mySet);
        Set<Integer> newSet = convertSet(mySet);
        System.out.println(newSet);
    }

    private static Set<Integer> convertSet(Set<Set<Integer>> set){
        return set.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}
