import { myPow } from "../../Recursive/myPow-050.js";
import assert from "assert";
describe("MyPOW", function () {
  function makeTest(inpt, res) {
    it(`[${JSON.stringify(inpt)}]'s pow result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(
        JSON.stringify(myPow(inpt[0], inpt[1])),
        JSON.stringify(res)
      );
    });
  }
  let inpts = [
    [2, 3],
    [2, -2],
    [0, 5],
    [0.33, 0],
  ];
  let res = [8, 0.25, 0, 1];
  for (let i = 0; i < inpts.length; i++) {
    makeTest(inpts[i], res[i]);
  }
});
