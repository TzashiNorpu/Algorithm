import { ListNode } from "./ListNode.js";
var swapPairs = function (head) {
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let prev = dummyHead;
  let curr = head;
  let next = head.next;
  while (next !== null) {
    let temp = head.next.next;
    next.next = curr;
    prev = curr;
    curr = temp;
    prev.next = curr;
    next = curr.next;
  }
  return dummyHead.next;
};

export { swapPairs };
