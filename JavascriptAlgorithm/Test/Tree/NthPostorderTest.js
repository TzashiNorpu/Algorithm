import { postorder } from "../../Tree/NthPostorder-590.js";
import assert from "assert";
import { NthTreeNode } from "../../Tree/NthTreeNode.js";
describe("NthPostorder", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s postorder result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(postorder(tree)), JSON.stringify(res));
    });
  }

  let level2Child = [new NthTreeNode(5), new NthTreeNode(6)];
  let level1Child = [
    new NthTreeNode(3, level2Child),
    new NthTreeNode(2),
    new NthTreeNode(4),
  ];
  let tree = new NthTreeNode(1, level1Child);
  let res = [5, 6, 3, 2, 4, 1];
  makeTest(tree, res);
});
