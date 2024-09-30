package easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SortedSquareArrayTest {
    
    @Test
    public void testSolutionOne() {
        int[] input =  new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedOutput =  new int[] {1, 4, 9, 16, 25, 36, 49, 64, 81};

        SortedSquareArray ssa = new SortedSquareArray();
        int[] actualOutput = ssa.sortedSquaredArray(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void testSolutionTwo() {
        int[] input =  new int[] {-5, -4, -3, -2, 1, 10};
        int[] expectedOutput =  new int[] {1, 4, 9, 16, 25, 100};

        SortedSquareArray ssa = new SortedSquareArray();
        int[] actualOutput = ssa.sortedSquaredArrayImproved(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}
