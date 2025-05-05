package example;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementCounter {
    public static Map<Object, Integer> countElements(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();

        for (Object element : array) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Object[] testArray = {1, 3, 7, 5, 1, 7, 4};
        System.out.println("Java result: " + countElements(testArray));
    }
}