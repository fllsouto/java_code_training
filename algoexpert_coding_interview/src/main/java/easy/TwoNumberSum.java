package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


/*
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. 
 * If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order. 
 * If no two numbers sum up to the target sum, the function should return an empty array.

    Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to 
    itself in order to obtain the target sum.

    You can assume that there will be at most one pair of numbers summing up to the target sum.

https://www.algoexpert.io/questions/two-number-sum
 */

public class TwoNumberSum {
    
    public int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == targetSum) {
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return new int[] {};
    }

    public int[] twoNumberSumWithComplement(int[] array, int targetSum) {
        Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();
        for (int i = 0; i< array.length; i++) {
            // S = X + Y
            // Y = S - X
            int key = array[i];
            if (complementMap.containsKey(key)) {
                int x = array[complementMap.get(key)];
                return new int[] {x , array[i] };
            } else {
                complementMap.put(targetSum - array[i], i);
            }
        }

        return new int[] { };
    }

    public int[] twoNumberSumWithEnhancedFor(int[] array, int targetSum) {
        Set<Integer> complementSet = new HashSet<Integer>();

        for (int x : array) {
            int complement = targetSum - x;
            if (complementSet.contains(complement)) {
                return new int[] {x, complement};
            } else {
                complementSet.add(x);
            }
        }

        return new int[] {};
    }
}