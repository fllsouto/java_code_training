/*
 * 
 */

package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static util.DebugHelper.debugPrint;
import static util.DebugHelper.printValue;

public class NonConstructibleChange {
    
    public int runNaive(int[] coins) {
        debugPrint(coins);
        Arrays.sort(coins);

        int minimunChangeICanNotMake = 1;
        boolean canMakeMinimumChange;
        int totalAmount;
        for (int amount = 1; ; amount++) {
            printValue("amount", amount);
            totalAmount = 0;
            canMakeMinimumChange = false;
            for (int j = 0; j < coins.length; j++) {
                printValue("totalAmount", totalAmount);
                totalAmount += coins[j];
                
                if (totalAmount == amount) {
                    printValue(">>totalAmount", totalAmount);
                    canMakeMinimumChange = true;
                    break;
                }
            }

            printValue("canMakeMinimumChange", canMakeMinimumChange);

            if (!canMakeMinimumChange) {
                minimunChangeICanNotMake = amount;
                break;
            }
            System.out.println("\n\n");
        }

        return minimunChangeICanNotMake;
    }

    public int runBF(int[] coins) {
        Arrays.sort(coins);
        int maxValue = Arrays.stream(coins).sum();
        int currentValue;
        printValue("maxValue", maxValue);
        
        for (int i = 1; i < maxValue; i++) {
            currentValue = i;
            printValue("currentValue", currentValue);
            for (int j = coins.length - 1; j >= 0; j--) {
                int coinValue = coins[j];
                
                if (coinValue <= currentValue) {
                    currentValue -= coinValue;
                }
                
                printValue("coinValue", coinValue);
                printValue("currentValue", currentValue);
                
                if (currentValue == 0) {
                    break;
                }
            }
            
            printValue("currentValue", currentValue);
            if (currentValue > 0) {
                return i;
            }
        }
        
        printValue("maxValue+1", maxValue+1);
        return maxValue + 1;
    }

    public int runOP(int[] coins) {
        Arrays.sort(coins);
        int c_value = 0;

        for (int coin : coins) {
            if (coin > c_value + 1) {
                break;
            }
            c_value += coin;
        }

        return c_value + 1;
    }

}