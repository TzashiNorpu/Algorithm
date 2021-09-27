import { reverseList } from "../../LinkedList/reverseList-206.js";
import assert from "assert";
import { ListNode } from "../../LinkedList/ListNode.js";
describe("reverseList", function () {
  function makeTest(l, expected) {
    it(`[${JSON.stringify(l)}] reverse result is [${JSON.stringify(
      expected
    )}]`, function () {
      assert.equal(JSON.stringify(reverseList(l)), JSON.stringify(expected));
    });
  }
  let l1 = new ListNode(1);
  l1.next = new ListNode(2);
  l1.next.next = new ListNode(4);

  let l2 = new ListNode(1);
  l2.next = new ListNode(3);
  l2.next.next = new ListNode(4);
  l2.next.next.next = new ListNode(5);

  let l1res = new ListNode(4);
  l1res.next = new ListNode(2);
  l1res.next.next = new ListNode(1);

  let l2res = new ListNode(5);
  l2res.next = new ListNode(4);
  l2res.next.next = new ListNode(3);
  l2res.next.next.next = new ListNode(1);

  let inpts = [l1, l2];
  let res = [l1res, l2res];

  for (let x = 0; x < inpts.length; x++) {
    makeTest(inpts[x], res[x]);
  }
});
