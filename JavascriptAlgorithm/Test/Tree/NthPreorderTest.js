import { preorder } from "../../Tree/NthPreorder-589.js";
import assert from "assert";
import { NthTreeNode } from "../../Tree/NthTreeNode.js";
describe("NthPreorder", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s preorder result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(preorder(tree)), JSON.stringify(res));
    });
  }

  let level2Child = [new NthTreeNode(5), new NthTreeNode(6)];
  let level1Child = [
    new NthTreeNode(3, level2Child),
    new NthTreeNode(2),
    new NthTreeNode(4),
  ];
  let tree = new NthTreeNode(1, level1Child);
  let res = [1, 3, 5, 6, 2, 4];
  makeTest(tree, res);
});
