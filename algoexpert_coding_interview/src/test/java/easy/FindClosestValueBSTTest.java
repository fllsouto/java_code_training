/*
 * 
 */

package easy;

import org.junit.jupiter.api.Test;

import easy.FindClosestValueBST;
import datastructure.BST;

import org.junit.jupiter.api.Disabled;
import static org.assertj.core.api.Assertions.assertThat;
import static util.DebugHelper.printValue;
import static util.DebugHelper.printBST;

public class FindClosestValueBSTTest {
    
    @Test
    public void test() {
        BST root = new BST(10);
        BST rootLeft = new BST(5);
        BST rootRight = new BST(15);
        root.addLeft(rootLeft);
        root.addRight(rootRight);

        BST rootLeftLeft = new BST(2);
        BST rootLeftRight = new BST(5);
        rootLeft.addLeft(rootLeftLeft);
        rootLeft.addRight(rootLeftRight);
        
        BST rootLeftLeftLeft = new BST(1);
        rootLeftLeft.addLeft(rootLeftLeftLeft);

        BST rootRightLeft = new BST(13);
        BST rootRightRight = new BST(22);
        rootRight.addLeft(rootRightLeft);
        rootRight.addRight(rootRightRight);
        
        BST rootRightLeftRight = new BST(14);
        rootRightLeft.addRight(rootRightLeftRight);



        printBST(root);

        FindClosestValueBST fcvBST = new FindClosestValueBST();
        int target = 12;
        int expectedOutput = 13;
        int actualOutput = fcvBST.run(root, target);

        // int[][] input = new int[][] {
        //     {1,2}
        // };
        // int[][] expectedOutput = new int[][] {
        //     {1},
        //     {2}
        // };

        // TransposeMatrix tm = new TransposeMatrix();
        // int[][] actualOutput = tm.run(input);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}