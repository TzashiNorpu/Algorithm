package algo.tzashinorpu.ThirdRound.Chapter07;

import algo.tzashinorpu.ThirdRound.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Codec_297Test {

    @Test
    void serialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Codec_297 ins = new Codec_297();
        String s = ins.serialize(root);
        System.out.println(s);
        System.out.println(Arrays.toString(s.split(",")));

    }

    @Test
    void deserialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Codec_297 ins = new Codec_297();
        String s = ins.serialize(root);
        TreeNode node = ins.deserialize(s);
        System.out.println("...");
    }
}