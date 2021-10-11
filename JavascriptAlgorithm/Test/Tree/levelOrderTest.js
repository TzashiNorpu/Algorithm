import { levelOrder1, levelOrder2 } from "../../Tree/levelOrder-429.js";
import assert from "assert";
import { NthTreeNode } from "../../Tree/NthTreeNode.js";
describe("levelOrder1", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s levelOrder1 result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(levelOrder1(tree)), JSON.stringify(res));
    });
  }

  let level2Child = [new NthTreeNode(5), new NthTreeNode(6)];
  let level1Child = [
    new NthTreeNode(3, level2Child),
    new NthTreeNode(2),
    new NthTreeNode(4),
  ];
  let tree = new NthTreeNode(1, level1Child);
  let res = [[1], [3, 2, 4], [5, 6]];
  makeTest(tree, res);
});

describe("levelOrder2", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s levelOrder2 result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(levelOrder2(tree)), JSON.stringify(res));
    });
  }

  let level2Child = [new NthTreeNode(5), new NthTreeNode(6)];
  let level1Child = [
    new NthTreeNode(3, level2Child),
    new NthTreeNode(2),
    new NthTreeNode(4),
  ];
  let tree = new NthTreeNode(1, level1Child);
  let res = [[1], [3, 2, 4], [5, 6]];
  makeTest(tree, res);
});
