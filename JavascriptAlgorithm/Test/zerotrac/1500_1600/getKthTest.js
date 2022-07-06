import {getKth} from "../../../zerotrac/1500_1600/getKth_1387.js";
import assert from "assert";
describe("getKth", function () {
    function makeTest(lo, hi, k, res) {
        it(`[
            lo:${JSON.stringify(lo)},
            hi:${JSON.stringify(hi)},
            k:${JSON.stringify(k)}
        ]'s getKth result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(getKth(lo, hi, k)), JSON.stringify(res));
        });
    }
    let lo = 12;
    let hi = 15;
    let k = 2;
    let res = 13;
    makeTest(lo, hi, k, res);
});