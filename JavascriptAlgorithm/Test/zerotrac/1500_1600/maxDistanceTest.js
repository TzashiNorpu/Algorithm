import {maxDistance} from "../../../zerotrac/1500_1600/maxDistance_1855.js";
import assert from "assert";
describe("maxDistance", function () {
    function makeTest(nums1, nums2, res) {
        it(`[
            nums1:${JSON.stringify(nums1)}
            nums2:${JSON.stringify(nums2)}
        ]'s maxDistance result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(maxDistance(nums1, nums2)), JSON.stringify(res));
        });
    }
    let nums1 = [30, 29, 19, 5];
    let nums2 = [25, 25, 25, 25, 25]
    let res = 2;
    makeTest(nums1, nums2, res);
});