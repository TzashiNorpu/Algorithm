import { ListNode } from "./ListNode.js";
var swapPairs = function (head) {
  let dummyHead = new ListNode(0);
  // dummyHead.next = head === null ? null : head.next || head;
  /* 为什么这样也可以:第一次 prev.next = node2 时 同时修改了 dummyHead.next 的指向[因为此时 prev 和 dummyHead 是同一个对象的引用]，
  后续的 prev.next = node2 由于 prev 指向的不再是 dummyHead，因此 prev.next 的修改不会再影响 dummyHead.next 的指向
  reverseKGroup 中也是同理：循环第一次执行时 prev 和 dummyHead 是同一个对象，因此 prev.next 的第一次执行同时也修改了 dummyHead.next 的值
  后续由于循环中修改了 prev 的指向，因此再执行 prev.next 也不会修改 dummyHead.next 的值 */
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
