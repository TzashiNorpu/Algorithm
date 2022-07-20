//
// Created by TzashiNorpu on 7/19/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> nextLargerNodes_1019::nextLargerNodes(ListNode *head) {
    vector<int> res, stack;
    for (ListNode *node = head; node; node = node->next) {
        while (stack.size() && res[stack.back()] < node->val) {
            res[stack.back()] = node->val;
            stack.pop_back();
        }
        stack.push_back(res.size());
        res.push_back(node->val);
    }
    for (int i: stack) res[i] = 0;
    return res;
}
