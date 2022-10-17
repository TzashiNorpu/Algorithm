//
// Created by TzashiNorpu on 10/17/2022.
//

#ifndef CLION_ARRAY_LIST_H
#define CLION_ARRAY_LIST_H

#include "vector"
#include "queue"
#include "unordered_set"

struct ListNode {
    int val;
    ListNode *next;

    ListNode() : val(0), next(nullptr) {}

    ListNode(int x) : val(x), next(nullptr) {}

    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

using namespace std;
namespace Array_List {

    class Solution {
    public:
        ListNode *mergeTwoLists(ListNode *list1, ListNode *list2);

        ListNode *partition(ListNode *head, int x);

        ListNode *mergeKLists(vector<ListNode *> &lists);

        ListNode *removeNthFromEnd(ListNode *head, int n);

        ListNode *middleNode(ListNode *head);

        bool hasCycle(ListNode *head);

        ListNode *detectCycle(ListNode *head);

        ListNode *getIntersectionNode(ListNode *headA, ListNode *headB);

        ListNode *addTwoNumbers(ListNode *l1, ListNode *l2);
    };
}
#endif //CLION_ARRAY_LIST_H
