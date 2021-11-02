package algo.tzashinorpu.SecondRound.Chapter07;

import algo.tzashinorpu.SecondRound.Chapter06.inorderTraversal_094;
import algo.tzashinorpu.SecondRound.TreeNode;
import org.junit.jupiter.api.Test;

class Codec_297Test {

    @Test
    void serialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Codec_297 instance = new Codec_297();
        System.out.println(instance.serialize(root));
    }

    @Test
    void testSerialize() {
        String s = "1,2,X,X,3,4,X,X,5,X,X";
        inorderTraversal_094 t = new inorderTraversal_094();

        Codec_297 instance = new Codec_297();
        System.out.println(t.inorderTraversal(instance.deserialize(s)));
    }
}