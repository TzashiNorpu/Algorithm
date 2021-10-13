import { invertTree } from "../../Tree/invertTree-226.js";
import { inorderTraversal } from "../../Tree/inorderTraversal-094.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("invertTree", function () {
  function makeTest(tree, res) {
    it(`Invert [${JSON.stringify(tree)}] tree's result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(
        JSON.stringify(inorderTraversal(invertTree(tree))),
        JSON.stringify(res)
      );
    });
  }
  let tree1 = new TreeNode(4);
  tree1.left = new TreeNode(2);
  tree1.right = new TreeNode(7);

  /* let tree2 = new TreeNode(1);
  tree2.left = new TreeNode(2);
  tree2.left.left = new TreeNode(3);
  tree2.left.left.left = new TreeNode(4);
  tree2.left.left.left.left = new TreeNode(5);

  let tree3 = new TreeNode(5);
  tree3.left = new TreeNode(1);
  tree3.right = new TreeNode(4);
  tree3.right.left = new TreeNode(3);
  tree3.right.right = new TreeNode(6); */

  let res = [[7, 4, 2]];
  let trees = [tree1 /* , tree2, tree3 */];
  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], res[i]);
  }
});
