//
// Created by TzashiNorpu on 6/1/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::middleNode(ListNode *head) {
    auto dummy = new ListNode(0);
    dummy->next = head;
    auto slow = dummy;
  auto fast = dummy;
  while (fast) {
    slow = slow->next;
    fast = fast->next;
    if (fast) fast = fast->next;
  }
  return slow;
}