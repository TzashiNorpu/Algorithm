import { postorderTraversal } from "../../Tree/postorderTraversal-145.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("postorderTraversal", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(
      tree
    )}]'s postorderTraversal result is ${JSON.stringify(res)}`, function () {
      assert.equal(
        JSON.stringify(postorderTraversal(tree)),
        JSON.stringify(res)
      );
    });
  }
  let tree = new TreeNode(1);
  tree.right = new TreeNode(2);
  tree.right.left = new TreeNode(3);
  let res = [3, 2, 1];
  makeTest(tree, res);
});
