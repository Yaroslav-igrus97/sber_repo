package Part_1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream numsStream = IntStream.range(1, 101);
        int x = numsStream.filter(num -> num % 2 == 0).sum();
        System.out.println(x);
    }

}
