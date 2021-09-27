import { hasCycle } from "../../LinkedList/hasCycle-141.js";
import assert from "assert";
import { ListNode } from "../../LinkedList/ListNode.js";
describe("hasCycle", function () {
  function makeTest(l, expected) {
    it(`[${l}] has cycle [${JSON.stringify(expected)}]`, function () {
      console.log(hasCycle(l));
    });
  }
  let l1 = new ListNode(1);
  l1.next = new ListNode(2);
  l1.next.next = new ListNode(4);

  let l2 = new ListNode(1);
  l2.next = new ListNode(3);
  let tmp = l2.next;
  l2.next.next = new ListNode(4);
  l2.next.next.next = new ListNode(5);
  l2.next.next.next = tmp;

  let inpts = [l1, l2];
  let res = [false, true];

  for (let x = 0; x < inpts.length; x++) {
    makeTest(inpts[x], res[x]);
  }
});
