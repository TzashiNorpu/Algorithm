import {minDeletions} from "../../../zerotrac/1500_1600/minDeletions_1647.js";
import assert from "assert";
describe("minDeletions", function () {
    function makeTest(s, res) {
        it(`[
            string:${JSON.stringify(s)}
        ]'s minDeletions result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(minDeletions(s)), JSON.stringify(res));
        });
    }
    let s = "aaabbbcc";
    let res = 2;
    makeTest(s, res);
});