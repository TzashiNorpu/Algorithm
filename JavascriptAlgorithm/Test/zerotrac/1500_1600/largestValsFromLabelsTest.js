import {largestValsFromLabels} from "../../../zerotrac/1500_1600/largestValsFromLabels_1090.js";
import assert from "assert";
describe("largestValsFromLabels", function () {
    function makeTest(values, labels, numWanted, useLimit, res) {
        it(`
         values:${JSON.stringify(values)},
         labels:${JSON.stringify(labels)},
         numWanted:${JSON.stringify(numWanted)},
         useLimit:${JSON.stringify(useLimit)}'s largestValsFromLabels result is ${JSON.stringify(
            res
        )}`, function () {
            assert.equal(JSON.stringify(largestValsFromLabels(values, labels, numWanted, useLimit)), JSON.stringify(res));
        });
    }


    let values = [[2, 6, 3, 6, 5]];
    let labels = [[1, 1, 2, 1, 1]];
    let numWanted = [3];
    let useLimit = [1];
    let res = [9];
    for (let i = 0; i < res.length; i++) {
        makeTest(values[i], labels[i], numWanted[i], useLimit[i], res[i]);
    }
});