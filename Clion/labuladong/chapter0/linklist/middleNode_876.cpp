//
// Created by TzashiNorpu on 6/1/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::middleNode(ListNode *head) {
  auto slow = head;
  auto fast = head;
  while (fast) {
    slow = slow->next;
    fast = fast->next;
    if (fast) fast = fast->next;
  }
  return slow;
}