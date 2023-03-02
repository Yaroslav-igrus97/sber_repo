package Part_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(multiply(nums));

    }

    private static int multiply(List<Integer> nums){
        return nums.stream()
                .reduce(1, (a, b) -> a * b);
    }
}
