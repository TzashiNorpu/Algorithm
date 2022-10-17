//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;


ListNode *Solution::mergeKLists(vector<ListNode *> &lists) {
  struct compare {
      bool operator()(const ListNode *l, const ListNode *r) {
        return l->val > r->val;
      }
  };
  ListNode *dummy = new ListNode();
  ListNode *p = dummy;
  priority_queue<ListNode *, vector<ListNode *>, compare> q;
  for (auto &list: lists)
    if (list)q.push(list);
  while (!q.empty()) {
    ListNode *top = q.top();
    p->next = top;
    if (q.top()->next)
      q.push(q.top()->next);
    q.pop();
    p = p->next;
  }
  return dummy->next;
}