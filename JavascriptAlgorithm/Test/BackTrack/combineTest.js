import { combine } from "../../BackTrack/combine-077.js";
import assert from "assert";
describe("combine", function () {
  function makeTest(n, k, expected) {
    it(`[${n}]'s [${k}] combine result is ${expected}`, function () {
      assert.equal(JSON.stringify(combine(n, k)), JSON.stringify(expected));
    });
  }
  let ns = [4, 1];
  let ks = [2, 1];
  let res = [
    [
      [1, 2],
      [1, 3],
      [1, 4],
      [2, 3],
      [2, 4],
      [3, 4],
    ],
    [[1]],
  ];
  for (let x = 0; x < ns.length; x++) {
    makeTest(ns[x], ks[x], res[x]);
  }
});
