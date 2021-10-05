import { trap1, trap2, trap3, trap4 } from "../../Array/trap-042.js";
import assert from "assert";
describe("trap1", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s trap area is ${expected}`, function () {
      assert.equal(trap1(height), expected);
    });
  }
  let heights = [
    [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
    [4, 2, 0, 3, 2, 5],
  ];
  let res = [6, 9];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});

describe("trap2", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s trap area is ${expected}`, function () {
      assert.equal(trap2(height), expected);
    });
  }
  let heights = [
    [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
    [4, 2, 0, 3, 2, 5],
  ];
  let res = [6, 9];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});

describe("trap3", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s trap area is ${expected}`, function () {
      assert.equal(trap3(height), expected);
    });
  }
  let heights = [
    [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
    [4, 2, 0, 3, 2, 5],
  ];
  let res = [6, 9];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});

describe("trap4", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s trap area is ${expected}`, function () {
      assert.equal(trap4(height), expected);
    });
  }
  let heights = [
    [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
    [4, 2, 0, 3, 2, 5],
  ];
  let res = [6, 9];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});
