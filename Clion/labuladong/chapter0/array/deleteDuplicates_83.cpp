//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::deleteDuplicates(ListNode *head) {
  auto dummy = new ListNode(-1);
  dummy->next = head;
  auto slow = head;
  auto fast = head;
  while (fast) {
    if (slow->val != fast->val)
      slow->next = fast, slow = fast;
    fast = fast->next;
  }
  // [1,1,2,3,3] -> [1,2,3,3]
  if (slow)slow->next = nullptr;
  return dummy->next;
}