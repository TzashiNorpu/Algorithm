import { generateParenthesis } from "../../Tree/generateParenthesis-022.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("generateParenthesis", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(
      tree
    )}]'s generateParenthesis result is ${JSON.stringify(res)}`, function () {
      assert.equal(
        JSON.stringify(generateParenthesis(tree)),
        JSON.stringify(res)
      );
    });
  }
  let ns = [3, 1];
  let res = [["((()))", "(()())", "(())()", "()(())", "()()()"], ["()"]];
  for (let i = 0; i < ns.length; i++) {
    makeTest(ns[i], res[i]);
  }
});
