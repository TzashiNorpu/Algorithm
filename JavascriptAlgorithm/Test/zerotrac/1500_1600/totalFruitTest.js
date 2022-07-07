import {totalFruit} from "../../../zerotrac/1500_1600/totalFruit_904.js";
import assert from "assert";
describe("totalFruit", function () {
    function makeTest(nums1, res) {
        it(`[
            nums1:${JSON.stringify(nums1)}
        ]'s totalFruit result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(totalFruit(nums1)), JSON.stringify(res));
        });
    }
    let f = [1, 2, 3, 2, 2];
    let res = 4;
    makeTest(f, res);
});