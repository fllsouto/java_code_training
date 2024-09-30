package easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ValidateSubsequenceTest {
    
    @Test
    public void testSolutionOne() {
        int[] sequence = new int[] {5, 1 , 22, 25, 6, -1, 8, 10};
        int[] subsequence = new int[] { 1, 6, -1, 10};

        ValidateSubsequence vs = new ValidateSubsequence();

        assertThat(vs.validate(sequence, subsequence)).isTrue();
    }

}
