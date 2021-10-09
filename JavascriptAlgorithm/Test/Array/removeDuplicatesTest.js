import { removeDuplicates } from "../../Array/removeDuplicates-026.js";
import assert from "assert";
describe("removeDuplicates", function () {
  function makeTest(num, expected) {
    it(`[${num}] remove duplicate item is ${expected}`, function () {
      assert.equal(
        JSON.stringify(removeDuplicates(num)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [1, 2],
    [1, 1, 2],
    [0, 0, 1, 1, 1, 2, 2, 3, 3, 4],
  ];
  let res = [
    [1, 2],
    [1, 2],
    [0, 1, 2, 3, 4],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
