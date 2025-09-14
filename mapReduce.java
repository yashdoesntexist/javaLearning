package javaLearning;

import java.util.HashMap;
import java.util.Map;

public class mapReduce {
    public static Map<String, Integer> returnCount(String[] listProduct) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String product : listProduct) {
            countMap.put(product, countMap.getOrDefault(product, 0) + 1);
        }
        return countMap;
    }

    public static void main(String[] args) {
        String[] listProduct = {"shoes", "laptop", "shoes", "phone", "laptop"};
        Map<String, Integer> result = returnCount(listProduct);
        System.out.println(result);
    }
}
