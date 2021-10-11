import { preorderTraversal } from "../../Tree/preorderTraversal-144.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("preorderTraversal", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(
      tree
    )}]'s preorderTraversal result is ${JSON.stringify(res)}`, function () {
      assert.equal(
        JSON.stringify(preorderTraversal(tree)),
        JSON.stringify(res)
      );
    });
  }
  let tree = new TreeNode(1);
  tree.right = new TreeNode(2);
  tree.right.left = new TreeNode(3);
  let res = [1, 2, 3];
  makeTest(tree, res);
});
