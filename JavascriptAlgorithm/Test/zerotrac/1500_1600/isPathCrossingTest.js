import {isPathCrossing} from "../../../zerotrac/1500_1600/isPathCrossing_1496.js";
import assert from "assert";
describe("isPathCrossing", function () {
    function makeTest(path, res) {
        it(`[
            path:${JSON.stringify(path)}
        ]'s isPathCrossing result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(isPathCrossing(path)), JSON.stringify(res));
        });
    }
    let path = "NESWW";
    let res = false;
    makeTest(path, res);
});