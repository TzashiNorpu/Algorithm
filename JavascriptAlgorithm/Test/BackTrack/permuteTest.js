import { permute } from "../../BackTrack/permute-046.js";
import assert from "assert";
describe("permute", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s permute result is ${expected}`, function () {
      assert.equal(JSON.stringify(permute(num)), JSON.stringify(expected));
    });
  }
  let nums = [
    [1, 2, 3],
    [0, 1],
  ];
  let res = [
    [
      [1, 2, 3],
      [1, 3, 2],
      [2, 1, 3],
      [2, 3, 1],
      [3, 1, 2],
      [3, 2, 1],
    ],
    [
      [0, 1],
      [1, 0],
    ],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
