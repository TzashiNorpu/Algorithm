import { groupAnagrams } from "../../Map/groupAnagrams-049.js";
import assert from "assert";
describe("groupAnagrams", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s groupAnagrams is ${expected} `, function () {
      assert.equal(
        JSON.stringify(groupAnagrams(num)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [["eat", "tea", "tan", "ate", "nat", "bat"], ["a"]];
  let res = [[["bat"], ["nat", "tan"], ["ate", "eat", "tea"]], [["a"]]];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
