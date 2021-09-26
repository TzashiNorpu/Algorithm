import { mergeTwoLists } from "../../LinkedList/mergeTwoLists-021.js";
import assert from "assert";
import { ListNode } from "../../LinkedList/ListNode.js";
describe("mergeTwoLists", function () {
    function makeTest(nums, expected) {
        it(`[${JSON.stringify(nums[0])},${JSON.stringify(nums[1])}] merge result is [${JSON.stringify(expected)}]`, function () {
            assert.equal(JSON.stringify(mergeTwoLists(nums[0], nums[1])), JSON.stringify(expected));
        });
    }
    let l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    let l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    let l3 = new ListNode(1);
    l3.next = new ListNode(1);
    l3.next.next = new ListNode(2);
    l3.next.next.next = new ListNode(3);
    l3.next.next.next.next = new ListNode(4);
    l3.next.next.next.next.next = new ListNode(4);

    let inpts = [[l1, l2]];
    let res = [l3];

    for (let x = 0; x < inpts.length; x++) {
        makeTest(inpts[x], res[x]);
    }
});