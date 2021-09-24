import { ListNode } from "./ListNode.js";
var mergeTwoLists = function (l1, l2) {
  let dummyHead = new ListNode(0);
  let concat = dummyHead;
  // 1 2 4 + 1 3 4
  /* while (l1 !== null || l2 !== null) {
        if (l1 === null) {
            concat.next = l2;
            return dummyHead.next;
        }
        if (l2 === null) {
            concat.next = l1;
            return dummyHead.next;
        }
        if (l1.val < l2.val) {
            concat.next = l1;
            l1 = l1.next;
        } else {
            concat.next = l2;
            l2 = l2.next;
        }
        concat = concat.next;
    } */
  while (l1 !== null && l2 !== null) {
    if (l1.val < l2.val) {
      concat.next = l1;
      l1 = l1.next;
    } else {
      concat.next = l2;
      l2 = l2.next;
    }
    concat = concat.next;
  }
//   concat.next = l1 === null ? l2 : l1;
  concat.next = l1 || l2;

  return dummyHead.next;
};
export { mergeTwoLists };
