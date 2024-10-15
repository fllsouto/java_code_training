package util;

import java.util.Arrays;

import datastructure.BST;

public class DebugHelper {
    public static void debugPrint(Object array) {
        if (array == null) {
            System.out.println("Array is null");
            return;
        }

        if (array instanceof int[]) {
            System.out.println(Arrays.toString((int[]) array));
        } else if (array instanceof double[]) {
            System.out.println(Arrays.toString((double[]) array));
        } else if (array instanceof char[]) {
            System.out.println(Arrays.toString((char[]) array));
        } else if (array instanceof boolean[]) {
            System.out.println(Arrays.toString((boolean[]) array));
        } else if (array instanceof byte[]) {
            System.out.println(Arrays.toString((byte[]) array));
        } else if (array instanceof short[]) {
            System.out.println(Arrays.toString((short[]) array));
        } else if (array instanceof long[]) {
            System.out.println(Arrays.toString((long[]) array));
        } else if (array instanceof float[]) {
            System.out.println(Arrays.toString((float[]) array));
        } else if (array instanceof Object[]) {
            // Handles non-primitive arrays (like String[] or Integer[])
            System.out.println(Arrays.deepToString((Object[]) array));
        } else {
            System.out.println("Unsupported array type.");
        }
    }

    public static void printValue(String valueName, Object value) {
        System.out.println("--------------------------------");
        System.out.println("ValueName: " + valueName);
        System.out.println("Value: " + value);
        System.out.println("--------------------------------");
    }

    public static void printPair(String valueAName, Object valueA, 
        String valueBName, Object valueB) {
        System.out.println("--------------------------------");
        System.out.println("(" + valueAName + ", " + valueBName + ") = (" + valueA + ", " + valueB + ")");
        System.out.println("--------------------------------");
    }

    public static void printBST(BST bst) {
        printValue("value", bst.value());
        
        if (bst.hasLeft()) {
            printValue("value.left", "");
            printBST(bst.left());
        }

        if (bst.hasRight()) {
            printValue("value.right", "");
            printBST(bst.right());
        }
    }
}
