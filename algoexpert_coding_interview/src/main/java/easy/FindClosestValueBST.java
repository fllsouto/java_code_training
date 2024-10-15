/*
 * 
 */

package easy;
import datastructure.BST;
import static util.DebugHelper.debugPrint;
import static util.DebugHelper.printValue;
import static util.DebugHelper.printBST;

public class FindClosestValueBST {
    public static int runRC(BST tree, int target) {
        System.out.println("\n\n");
        printBST(tree);
        if (target == tree.value()) {
            return tree.value();
        } else if (target > tree.value()) {
            if (tree.right() != null) {
                run(tree.right(), target);
          } else {
              return tree.value();
            }
        } else {
            if (tree.left() != null) {
                run(tree.left(), target);
            } else {
                return tree.value();
            }
        }
        return -1;
    }

    public static int runIT(BST tree, int target) {
        
    }

}

