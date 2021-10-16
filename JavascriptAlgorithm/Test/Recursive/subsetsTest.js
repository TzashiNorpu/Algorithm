import { subsets } from "../../Recursive/subsets-078.js";
import assert from "assert";
describe("subsets", function () {
  function makeTest(inpt, res) {
    it(`[${JSON.stringify(inpt)}]'s subsets result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(subsets(inpt)), JSON.stringify(res));
    });
  }
  let inpts = [[2, 3]];
  let res = [[[2, 3], [2], [3], []]];
  for (let i = 0; i < inpts.length; i++) {
    makeTest(inpts[i], res[i]);
  }
});
