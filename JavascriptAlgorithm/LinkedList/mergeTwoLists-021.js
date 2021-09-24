import { ListNode } from "./ListNode.js"
var mergeTwoLists = function (l1, l2) {
    let dummyHead = new ListNode(0);
    let concat = dummyHead;
    // 1 2 5 + 1  4
    while (l1 !== null || l2 !== null) {
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
    }
    return dummyHead.next;
};
export { mergeTwoLists };