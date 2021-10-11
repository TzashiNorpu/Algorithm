import { inorderTraversal } from "../../Tree/inorderTraversal-094.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("inorderTraversal", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s inorderTraversal result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(inorderTraversal(tree)), JSON.stringify(res));
    });
  }
  let tree = new TreeNode(1);
  tree.right = new TreeNode(2);
  tree.right.left = new TreeNode(3);
  let res = [1, 3, 2];
  makeTest(tree, res);
});
