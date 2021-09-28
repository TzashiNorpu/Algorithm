import { ListNode } from "./ListNode.js";
var swapPairs = function (head) {
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let prev = dummyHead;
  while (head !== null && head.next !== null) {
    let node1 = head;
    let node2 = head.next;
    let nxtGroupHead = node2.next;

    prev.next = node2;
    node2.next = node1;
    node1.next = nxtGroupHead;

    prev = node1;
    head = nxtGroupHead;
  }
  return dummyHead.next;
};

export { swapPairs };
