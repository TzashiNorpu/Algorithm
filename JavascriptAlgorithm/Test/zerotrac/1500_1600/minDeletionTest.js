import {minDeletion} from "../../../zerotrac/1500_1600/minDeletion_2216.js";
import assert from "assert";
describe("minDeletion", function () {
    function makeTest(nums, res) {
        it(`[
            string:${JSON.stringify(nums)}
        ]'s minDeletion result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(minDeletion(nums)), JSON.stringify(res));
        });
    }
    let nums = [1, 1, 2, 2, 3, 3, 4];
    let res = 1;
    makeTest(nums, res);
});