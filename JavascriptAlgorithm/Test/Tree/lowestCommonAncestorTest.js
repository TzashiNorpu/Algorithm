import { lowestCommonAncestor } from "../../Tree/lowestCommonAncestor-236.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("lowestCommonAncestor", function () {
  function makeTest(tree, target, res) {
    it(`[${JSON.stringify(tree)}]'s lowestCommonAncestor is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(
        JSON.stringify(lowestCommonAncestor(tree, target[0], target[1]).val),
        JSON.stringify(res)
      );
    });
  }

  let tree1 = new TreeNode(1);
  tree1.left = new TreeNode(2);
  tree1.right = new TreeNode(3);

  let tree2 = new TreeNode(2);
  tree2.left = new TreeNode(1);
  tree2.right = new TreeNode(3);

  let tree3 = new TreeNode(5);
  tree3.left = new TreeNode(1);
  tree3.right = new TreeNode(4);
  tree3.right.left = new TreeNode(3);
  tree3.right.right = new TreeNode(6);

  let tree4 = new TreeNode(3);
  tree4.left = new TreeNode(5);
  tree4.left.left = new TreeNode(6);
  tree4.left.right = new TreeNode(2);
  tree4.left.right.left = new TreeNode(7);
  tree4.left.right.right = new TreeNode(4);
  tree4.right = new TreeNode(1);
  tree4.right.left = new TreeNode(0);
  tree4.right.right = new TreeNode(8);

  let trees = [tree1, tree2, tree3, tree4];
  let targets = [
    [2, 3],
    [2, 2],
    [4, 3],
    [5, 1],
  ];
  let res = [1, 2, 4, 3];

  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], targets[i], res[i]);
  }
});
