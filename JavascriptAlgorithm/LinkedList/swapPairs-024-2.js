import { ListNode } from "./ListNode.js";
var swapPairs = function (head) {
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let prev = dummyHead;
  while (head !== null && head.next !== null) {
    let node1 = head;
    let node2 = head.next;
    let tmp = node2.next;
    prev.next = node2;
    node2.next = node1;
    node1.next = tmp;
    head = tmp;
    prev = node1;
  }
  return dummyHead.next;
};

export { swapPairs };
