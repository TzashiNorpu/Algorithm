import { ListNode } from "./ListNode.js";
var swapPairs = function (head) {
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let temp = dummyHead;
  while (temp.next!==null&&temp.next.next!==null) {
    let node1 = temp.next;
    let node2 = temp.next.next;
    temp.next = node2;
    node1.next = node2.next;
    node2.next = node1;
    temp = node1;
  }
  return dummyHead.next;
};

export { swapPairs };
