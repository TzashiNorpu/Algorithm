import { ListNode } from "./ListNode.js";
var reverseKGroup = function (head, k) {
  let reverse = function (head) {
    let prev = null;
    while (head !== null) {
      let nxt = head.next;
      head.next = prev;
      [prev, head] = [head, nxt];
    }
    return prev;
  };
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let prev = dummyHead,
    currTail = dummyHead;
  while (currTail !== null) {
    let loop = k;
    while (loop-- && currTail !== null) {
      currTail = currTail.next;
    }
    if (currTail === null) {
      return dummyHead.next;
    }
    let nxtHead = currTail.next;
    let currHead = prev.next;
    currTail.next = null;
    prev.next = reverse(currHead);
    currHead.next = nxtHead;
    [prev, currTail] = [currHead, currHead];
  }
  return dummyHead.next;
};
export { reverseKGroup };
