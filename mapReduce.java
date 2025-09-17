package javaLearning;

import java.io.*;
import java.util.*;

public class mapReduce {
    public static void main(String[] args) throws Exception {
        // Simulate reading file
        List<String> lines = Arrays.asList(
                "[Vancouver] Customer asked about product shoes",
                "[Toronto] Customer asked about product laptop",
                "[Calgary] Customer asked about product shoes",
                "[Vancouver] Customer asked about product phone",
                "[Toronto] Customer asked about product laptop"
        );

        // MAP: emit (product, 1)
        List<Map.Entry<String, Integer>> mapped = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split("product ");
            if (parts.length > 1) {
                String product = parts[1].trim();
                mapped.add(new AbstractMap.SimpleEntry<>(product, 1));
            }
        }

        // SHUFFLE: group by product
        Map<String, List<Integer>> grouped = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapped) {
            grouped.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue());
        }

        // REDUCE: sum counts
        Map<String, Integer> reduced = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : grouped.entrySet()) {
            int sum = entry.getValue().stream().mapToInt(i -> i).sum();
            reduced.put(entry.getKey(), sum);
        }

        System.out.println("Product counts: " + reduced);
    }
}
