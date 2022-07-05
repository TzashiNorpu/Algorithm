import {minimumLength} from "../../../zerotrac/1500_1600/minimumLength_1750.js";
import assert from "assert";
describe("minimumLength", function () {
    function makeTest(s, res) {
        it(`[${JSON.stringify(s)}]'s minimumLength result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(minimumLength(s)), JSON.stringify(res));
        });
    }
    let string = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
    let res = 1;
    makeTest(string, res);
});