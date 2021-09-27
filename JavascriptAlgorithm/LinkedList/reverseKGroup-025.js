import { ListNode } from "./ListNode.js";
var reverseKGroup = function (head, k) {
  let reverse = function (head) {
    let prev = null;
    while (head !== null) {
      let temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  };
  let dummyHead = new ListNode(0);
  dummyHead.next = head;
  let currTail = dummyHead,
    prev = dummyHead;

  while (currTail !== null) {
    let k1 = k;
    while (k1-- && currTail !== null) {
      currTail = currTail.next;
    }
    if (currTail === null) {
      break;
    }
    let currHead = prev.next;
    let nxtHead = currTail.next;

    currTail.next = null;
    prev.next = reverse(currHead);
    currHead.next = nxtHead;
    /* 
    prev = currHead;
    currTail = currHead; */
    [prev, currTail] = [currHead, currHead];
  }

  return dummyHead.next;
};
export { reverseKGroup };
