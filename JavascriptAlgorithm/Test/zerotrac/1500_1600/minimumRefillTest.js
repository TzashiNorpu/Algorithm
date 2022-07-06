import {minimumRefill} from "../../../zerotrac/1500_1600/minimumRefill_2105.js";
import assert from "assert";
describe("minimumRefill", function () {
    function makeTest(plants, capacityA, capacityB, res) {
        it(`[
            ${JSON.stringify(plants)},
            ${JSON.stringify(capacityA)}
            ${JSON.stringify(capacityB)}
        ]'s minimumRefill result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(minimumRefill(plants, capacityA, capacityB)), JSON.stringify(res));
        });
    }
    let plants = [2, 2, 3, 3];
    let capacityA = 5;
    let capacityB = 5;
    let res = 1;
    makeTest(plants, capacityA, capacityB, res);
});