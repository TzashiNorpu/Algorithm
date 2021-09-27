var hasCycle = function (head) {
  /* let slow = head,
    fast = head.next;
  while (slow !== fast) {
    if (slow === null || fast === null) {
      return false;
    }
    slow = slow.next;
    fast = fast.next !== null ? fast.next.next : null;
  }
  return true; */
  if (head === null) {
    return false;
  }
  let slow = head,
    fast = head;
  while (fast !== null && fast.next !== null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow === fast) {
      return true;
    }
  }
  return false;
};
export { hasCycle };
