/*
 * 
 */

package easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TransposeMatrixTest {
    
    @Test
    public void test() {
        // int[][] input = new int[][] {
        //     {1,2}
        // };
        // int[][] expectedOutput = new int[][] {
        //     {1},
        //     {2}
        // };

        int[][] input = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        int[][] expectedOutput = new int[][] {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9},
        };

        TransposeMatrix tm = new TransposeMatrix();
        int[][] actualOutput = tm.run(input);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}