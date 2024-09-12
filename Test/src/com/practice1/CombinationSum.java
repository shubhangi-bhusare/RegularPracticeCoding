package com.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example input array
        int target = 8;
        List<List<Integer>> result = findCombinations(array, target);
        System.out.println(result);
    }

    public static List<List<Integer>> findCombinations(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array); // Sorting helps to avoid duplicates
        backtrack(result, new ArrayList<>(), array, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] array, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < array.length; i++) {
            if (i > start && array[i] == array[i - 1]) continue; // Skip duplicates
            if (array[i] > target) break; // No need to continue if the number exceeds the target
            tempList.add(array[i]);
            backtrack(result, tempList, array, target - array[i], i); // Not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}