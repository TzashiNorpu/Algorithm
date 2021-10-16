import { levelOrder1, levelOrder2 } from "../../Tree/levelOrder-102.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("levelOrder1", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s levelOrder result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(levelOrder1(tree)), JSON.stringify(res));
    });
  }
  let tree = new TreeNode(1);
  tree.left = new TreeNode(2);
  tree.right = new TreeNode(3);
  let res = [[[1], [2, 3]]];
  let trees = [tree];
  for (let i = 0; i < res.length; i++) {
    makeTest(trees[i], res[i]);
  }
});

describe("levelOrder2", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s levelOrder result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(levelOrder2(tree)), JSON.stringify(res));
    });
  }
  let tree = new TreeNode(1);
  tree.left = new TreeNode(2);
  tree.right = new TreeNode(3);
  let res = [[[1], [2, 3]]];
  let trees = [tree];
  for (let i = 0; i < res.length; i++) {
    makeTest(trees[i], res[i]);
  }
});
