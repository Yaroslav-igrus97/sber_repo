package Part_4;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Double> nums = List.of(1.1, 2.0, 1.1, 4.5, 2.1);
        System.out.println(sort(nums));
    }

    private static List<Double> sort(List<Double> nums){
        return nums.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
