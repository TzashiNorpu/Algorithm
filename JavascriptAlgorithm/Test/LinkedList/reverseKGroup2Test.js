import { reverseKGroup } from "../../LinkedList/reverseKGroup-025-2.js";
import assert from "assert";
import { ListNode } from "../../LinkedList/ListNode.js";
describe("reverseKGroup-2", function () {
  function makeTest(l, k, expected) {
    it(`[${JSON.stringify(l)}] reverse ${k} Group result is [${JSON.stringify(
      expected
    )}]`, function () {
      assert.equal(
        JSON.stringify(reverseKGroup(l, k)),
        JSON.stringify(expected)
      );
    });
  }
  let l1 = new ListNode(1);
  l1.next = new ListNode(2);
  l1.next.next = new ListNode(4);

  let l2 = new ListNode(1);
  l2.next = new ListNode(3);
  l2.next.next = new ListNode(4);
  l2.next.next.next = new ListNode(5);

  let l1res = new ListNode(2);
  l1res.next = new ListNode(1);
  l1res.next.next = new ListNode(4);

  let l2res = new ListNode(4);
  l2res.next = new ListNode(3);
  l2res.next.next = new ListNode(1);
  l2res.next.next.next = new ListNode(5);

  let inpts = [l1, l2];
  let reverseK = [2, 3];
  let res = [l1res, l2res];

  for (let x = 0; x < inpts.length; x++) {
    makeTest(inpts[x], reverseK[x], res[x]);
  }
});
