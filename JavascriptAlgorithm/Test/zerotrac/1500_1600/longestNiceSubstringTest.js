import {longestNiceSubstring} from "../../../zerotrac/1500_1600/longestNiceSubstring_1763.js";
import assert from "assert";
describe("longestNiceSubstring", function () {
    function makeTest(s, res) {
        it(`[
            nums1:${JSON.stringify(s)}
        ]'s longestNiceSubstring result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(longestNiceSubstring(s)), JSON.stringify(res));
        });
    }
    let s = "YazaAay";
    let res = "aAa";
    makeTest(s, res);
});