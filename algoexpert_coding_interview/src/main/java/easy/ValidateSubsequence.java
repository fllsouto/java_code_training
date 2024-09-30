/*
 * Given two non-empty arrays of integers, write a function that determines whether the second array 
 * is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that 
are in the same order as they appear in the array. For instance, the numbers [1, 3, 4] form a subsequence 
of the array [1, 2, 3, 4], and so do the numbers [2, 4]. Note that a single number in an array and the 
array itself are both valid subsequences of the array.

https://www.algoexpert.io/questions/validate-subsequence
 */

package easy;

import java.util.List;

public class ValidateSubsequence {
    
    public boolean validate(int[] sequence, int[] subsequence) {
        int j = 0;
        for(int i = 0; i < sequence.length; i++) {
            int k = sequence[i];
            int l = subsequence[j];

            if (k == l) {
                System.out.println("[" + i + "] = " + k);
                System.out.println("[" + j + "] = " + l + "\n");
                j++;
            }

            if (j == subsequence.length)
                return true;
        }
        return false;
    }

    public static boolean validateShortVersion(List<Integer> array, List<Integer> sequence) {
        for(int i = 0, j = 0; i < array.size(); i++) {
            if (array.get(i) == sequence.get(j))
                j++;

            if (j == sequence.size())
                return true;
        }
        return false;
    }
}