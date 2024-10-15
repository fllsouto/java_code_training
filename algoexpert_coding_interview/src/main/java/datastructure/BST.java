package datastructure;

import static util.DebugHelper.printValue;

public class BST {

    private int value;
    private BST left;
    private BST right;

    public BST(int value, BST left, BST right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }

    public BST(int value) {
        this(value, null, null);
    }

    public void addLeft(BST left) {
        this.left = left;
    }

    public void addRight(BST right) {
        this.right = right;
    }

    public int value() {
        return this.value;
    }

    public BST left() {
        return this.left;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public BST right() {
        return this.right;
    }

    public boolean hasRight() {
        return this.right != null;
    }
}
