import { climbStairs1, climbStairs2,climbStairs3 } from "../../Array/climbStairs-070.js";
import assert from "assert";
describe("climbStairs1", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s steps is ${expected}`, function () {
      assert.equal(climbStairs1(num), expected);
    });
  }
  let nums = [1, 2, 3, 4, 5, 20];
  let res = [1, 2, 3, 5, 8, 10946];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});

describe("climbStairs2", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s steps is ${expected}`, function () {
      assert.equal(climbStairs2(num), expected);
    });
  }
  let nums = [1, 2, 3, 4, 5, 20];
  let res = [1, 2, 3, 5, 8, 10946];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});


describe("climbStairs3", function () {
    function makeTest(num, expected) {
      it(`[${num}]'s steps is ${expected}`, function () {
        assert.equal(climbStairs3(num), expected);
      });
    }
    let nums = [1, 2, 3, 4, 5, 20];
    let res = [1, 2, 3, 5, 8, 10946];
    for (let x = 0; x < nums.length; x++) {
      makeTest(nums[x], res[x]);
    }
  });
  