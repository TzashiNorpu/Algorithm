import {partitionDisjoint} from "../../../zerotrac/1500_1600/partitionDisjoint_915.js";
import assert from "assert";
describe("partitionDisjoint", function () {
    function makeTest(nums, res) {
        it(`[${JSON.stringify(nums)}]'s partitionDisjoint result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(partitionDisjoint(nums)), JSON.stringify(res));
        });
    }
    let nums = [32, 57, 24, 19, 0, 24, 49, 67, 87, 87];
    let res = 7;
    makeTest(nums, res);
});