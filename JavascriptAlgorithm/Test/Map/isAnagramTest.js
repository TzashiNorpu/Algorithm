import { isAnagram2, isAnagram1 } from "../../Map/isAnagram-242.js";
import assert from "assert";
describe("isAnagram1", function () {
  function makeTest(str, expected) {
    it(`[${str}]'s isAnagram is ${expected} `, function () {
      assert.equal(isAnagram1(str[0], str[1]), expected);
    });
  }
  let strs = [
    ["anagram", "nagaram"],
    ["rat", "car"],
    ["😍x", "x😍"],
  ];
  let res = [true, false, true];
  for (let x = 0; x < strs.length; x++) {
    makeTest(strs[x], res[x]);
  }
});

describe("isAnagram2", function () {
  function makeTest(str, expected) {
    it(`[${str}]'s isAnagram is ${expected} `, function () {
      assert.equal(isAnagram2(str[0], str[1]), expected);
    });
  }
  let strs = [
    ["anagram", "nagaram"],
    ["rat", "car"],
  ];
  let res = [true, false];
  for (let x = 0; x < strs.length; x++) {
    makeTest(strs[x], res[x]);
  }
});
