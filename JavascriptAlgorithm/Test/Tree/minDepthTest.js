import { minDepth1, minDepth2 } from "../../Tree/minDepth-111.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("minDepth1", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s minDepth is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(minDepth1(tree)), JSON.stringify(res));
    });
  }
  let tree1 = new TreeNode(1);
  tree1.left = new TreeNode(2);
  tree1.right = new TreeNode(6);
  tree1.left.left = new TreeNode(3);
  tree1.left.left.left = new TreeNode(4);
  tree1.left.left.left.left = new TreeNode(5);

  let tree2 = new TreeNode(1);
  tree2.left = new TreeNode(2);
  tree2.left.left = new TreeNode(3);
  tree2.left.left.left = new TreeNode(4);
  tree2.left.left.left.left = new TreeNode(5);

  let tree3 = new TreeNode(5);
  tree3.left = new TreeNode(1);
  tree3.right = new TreeNode(4);
  tree3.right.left = new TreeNode(3);
  tree3.right.right = new TreeNode(6);

  let res = [2, 5, 2];
  let trees = [tree1, tree2, tree3];
  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], res[i]);
  }
});

describe("minDepth2", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s minDepth is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(minDepth2(tree)), JSON.stringify(res));
    });
  }
  let tree1 = new TreeNode(1);
  tree1.left = new TreeNode(2);
  tree1.right = new TreeNode(6);
  tree1.left.left = new TreeNode(3);
  tree1.left.left.left = new TreeNode(4);
  tree1.left.left.left.left = new TreeNode(5);

  let tree2 = new TreeNode(1);
  tree2.left = new TreeNode(2);
  tree2.left.left = new TreeNode(3);
  tree2.left.left.left = new TreeNode(4);
  tree2.left.left.left.left = new TreeNode(5);

  let tree3 = new TreeNode(5);
  tree3.left = new TreeNode(1);
  tree3.right = new TreeNode(4);
  tree3.right.left = new TreeNode(3);
  tree3.right.right = new TreeNode(6);

  let res = [2, 5, 2];
  let trees = [tree1, tree2, tree3];
  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], res[i]);
  }
});
