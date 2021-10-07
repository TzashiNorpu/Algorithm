import { isValid } from "../../Array/isValid-020.js";
import assert from "assert";
describe("isValid", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s steps is ${expected}`, function () {
      assert.equal(isValid(num), expected);
    });
  }
  let nums = ["()[]{}","()","][","(]"];
  let res = [true,true,false,false];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
