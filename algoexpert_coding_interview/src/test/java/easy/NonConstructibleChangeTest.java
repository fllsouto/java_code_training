/*
 * 
 */

package easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.assertj.core.api.Assertions.assertThat;

public class NonConstructibleChangeTest {
    
    @Test
    @Disabled
    public void testNaive() {
        int[] coins = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expectedOutput = 20;
        
        //int[] coins = new int[] {1, 5, 2}; 
        //int expectedOutput = 4;

        NonConstructibleChange ncc = new NonConstructibleChange();
        int actualOutput = ncc.runNaive(coins);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void testBF() {
        int[] coins = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expectedOutput = 20;
        
        //int[] coins = new int[] {1, 5, 2}; 
        //int expectedOutput = 4;

        NonConstructibleChange ncc = new NonConstructibleChange();
        int actualOutput = ncc.runBF(coins);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void testOP() {
        int[] coins = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expectedOutput = 20;
        
        //int[] coins = new int[] {1, 5, 2}; 
        //int expectedOutput = 4;

        NonConstructibleChange ncc = new NonConstructibleChange();
        int actualOutput = ncc.runOP(coins);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}