import { merge } from "../../Array/merge-088.js";
import assert from "assert";
describe("merge", function () {
  function makeTest(arg1, arg2, expected) {
    it(`[${arg1[0]}] merge [${arg1[1]}]  is ${expected}`, function () {
      assert.equal(
        JSON.stringify(merge(arg1[0], arg2[0], arg1[1], arg2[1])),
        JSON.stringify(expected)
      );
    });
  }
  let arg1s = [
    [
      [1, 2, 3, 0, 0, 0],
      [2, 5, 6],
    ],
    // [[1], []],
  ];
  let arg2s = [
    [3, 3],
    // [1, 0],
  ];
  let res = [[1, 2, 2, 3, 5, 6] /* , [1] */];
  for (let x = 0; x < arg1s.length; x++) {
    makeTest(arg1s[x], arg2s[x], res[x]);
  }
});
