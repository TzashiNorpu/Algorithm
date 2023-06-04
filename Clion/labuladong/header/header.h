//
// Created by TzashiNorpu on 5/31/2023.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H
using namespace std;

#include "unordered_set"
#include "vector"
#include "queue"
#include "string"
#include "functional"

namespace labuladong {
    struct ListNode {
        int val;
        ListNode *next;

        ListNode(int x) : val(x), next(nullptr) {}
    };

     struct TreeNode {
             int val;
             TreeNode *left;
             TreeNode *right;
             TreeNode() : val(0), left(nullptr), right(nullptr) {}
             TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
             TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
         };

    class Solution {
    public:
        bool hasCycle(ListNode *head);

        ListNode *detectCycle(ListNode *head);

        ListNode *getIntersectionNode(ListNode *headA, ListNode *headB);

        ListNode *removeNthFromEnd(ListNode *head, int n);

        ListNode *mergeTwoLists(ListNode *list1, ListNode *list2);

        ListNode *mergeKLists(vector<ListNode *> &lists);

        ListNode *partition(ListNode *head, int x);

        ListNode *middleNode(ListNode *head);

        ListNode *getKthFromEnd(ListNode *head, int k);

        vector<int> twoSum(vector<int> &numbers, int target);

        int removeDuplicates(vector<int> &nums);

        int removeElement(vector<int> &nums, int val);

        void moveZeroes(vector<int> &nums);

        void reverseString(vector<char> &s);

        string longestPalindrome(string s);

        ListNode *deleteDuplicates(ListNode *head);

        int maxDepth(TreeNode* root);

        vector<int> preorderTraversal(TreeNode* root);

        int diameterOfBinaryTree(TreeNode* root);

    };
}


#endif //CLION_HEADER_H
