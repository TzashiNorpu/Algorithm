import {
  serialize,
  deserialize,
} from "../../Tree/serializeAndDeserializeOfBinaryTree-297.js";
import { inorderTraversal } from "../../Tree/inorderTraversal-094.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("serialize", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s serialize result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(serialize(tree)), JSON.stringify(res));
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

  let trees = [tree1, tree2, tree3];
  let res = ["1,2,X,X,3,X,X", "2,1,X,X,3,X,X", "5,1,X,X,4,3,X,X,6,X,X"];
  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], res[i]);
  }
});

describe("deserialize", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s deserialize result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(
        JSON.stringify(inorderTraversal(deserialize(tree))),
        JSON.stringify(res)
      );
    });
  }

  let inpts = ["1,2,X,X,3,X,X", "2,1,X,X,3,X,X", "5,1,X,X,4,3,X,X,6,X,X"];
  let res = [
    [2, 1, 3],
    [1, 2, 3],
    [1, 5, 3, 4, 6],
  ];
  for (let i = 0; i < inpts.length; i++) {
    makeTest(inpts[i], res[i]);
  }
});
