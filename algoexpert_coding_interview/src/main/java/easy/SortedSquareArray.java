package easy;

import java.util.Arrays;

public class SortedSquareArray {
    public int[] sortedSquaredArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * array[i]; 
        }
        Arrays.sort(newArray);
        return newArray;
        // O(n + nlgn) = O(nlgn)
    }

    public int[] sortedSquaredArrayImproved(int[] array) {
        int[] newArray = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int k = array.length - 1;
        while (i <= j) {
            int beginSquared = array[i] * array[i];
            int endSquared = array[j] * array[j];

            if (endSquared > beginSquared) {
                newArray[k] = endSquared;
                j--;
            } else {
                newArray[k] = beginSquared;
                i++;
            }
            k--;
            
            
        }
        //System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private void debug(int i, int j, int k ,int beginSquared, int endSquared) {
        System.out.println("i :: " + i);
        System.out.println("j :: " + j);
        System.out.println("k :: " + k);
        System.out.println("beginSquared :: " + beginSquared);
        System.out.println("endSquared :: " + endSquared);
        System.out.println("\n");
    }

}
