var reverseList = function (head) {
  let prev = null;
  while (head !== null) {
    let tmp = head.next;
    head.next = prev;
    prev = head;
    head = tmp;
  }
  return prev;
};
export { reverseList };
