package algo.tzashinorpu.FirstRound.Chapter06;

public class BinaryTree {
    public int val;
    public BinaryTree left,right;
    public BinaryTree(){}

    public BinaryTree(int val, BinaryTree l, BinaryTree r) {
        this.val = val;
        this.left = l;
        this.right =r;
    }
    public BinaryTree(int x) { this.val = x; }
}
