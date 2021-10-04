import { ListNode } from "./ListNode.js";
var reverseKGroup = function (head, k) {
  let reverse = function (head) {
    let prev = null;
    while (head != null) {
      let tmp = head.next;
      head.next = prev;
      prev = head;
      head = tmp;
    }
    return prev;
  };
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let prev = dummyHead,
    kTail = dummyHead;

  while (kTail !== null) {
    let loop = k;
    while (loop-- && kTail !== null) {
      kTail = kTail.next;
    }
    if (kTail === null) {
      return dummyHead.next;
    }
    let kHead = prev.next;
    let nxtKHead = kTail.next;
    kTail.next = null;
    prev.next = reverse(kHead);

    kHead.next = nxtKHead;
    [prev, kTail] = [kHead, kHead];
  }
  return dummyHead.next;
};
export { reverseKGroup };
