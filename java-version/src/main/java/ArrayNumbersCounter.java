package src.main.java;

import java.util.HashMap;
import java.util.Map;

public class ArrayNumbersCounter {

    public static Map<Integer, Integer> countNumbers(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.merge(num, 1, Integer::sum);
        }

        return counts;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countNumbers(testNumbers);

        System.out.println("Результат:");
        result.forEach((num, count) ->
                System.out.println(num + " : " + count)
        );
    }
}