package easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TwoNumberSumTest {
    
    @Test
    public void testSolutionOne() {
        int[] input =  new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] expectedOutput =  new int[] {-1, 11};

        TwoNumberSum tns = new TwoNumberSum();
        int[] actualOutput = tns.twoNumberSum(input, targetSum);

        for (int i : expectedOutput) {
            assertThat(actualOutput).contains(i);
        }
    }

    @Test
    public void testSolutionTwo() {
        int[] input =  new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] expectedOutput =  new int[] {-1, 11};

        TwoNumberSum tns = new TwoNumberSum();
        int[] actualOutput = tns.twoNumberSumWithComplement(input, targetSum);

        for (int i : expectedOutput) {
            assertThat(actualOutput).contains(i);
        }
    }

    @Test
    public void testSolutionThree() {
        int[] input =  new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] expectedOutput =  new int[] {-1, 11};

        TwoNumberSum tns = new TwoNumberSum();
        int[] actualOutput = tns.twoNumberSumWithEnhancedFor(input, targetSum);

        for (int i : expectedOutput) {
            assertThat(actualOutput).contains(i);
        }
    }
}
