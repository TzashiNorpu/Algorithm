import {reorderedPowerOf2} from "../../../zerotrac/1500_1600/reorderedPowerOf2_869.js";
import assert from "assert";
describe("reorderedPowerOf2", function () {
    function makeTest(nums, res) {
        it(`[${JSON.stringify(nums)}]'s reorderedPowerOf2 result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(reorderedPowerOf2(nums)), JSON.stringify(res));
        });
    }
    let nums = 1;
    let res = true;
    makeTest(nums, res);
});