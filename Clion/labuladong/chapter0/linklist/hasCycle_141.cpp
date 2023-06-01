//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

bool Solution::hasCycle(ListNode *head) {
  // 1
  /*if (!head) return false;
  ListNode *x = head->next;
  while (x != head) {
    if (!x || !x->next) return false;
    x = x->next->next;
    head = head->next;
  }
  return true;*/
  // 2
  unordered_set < ListNode * > s;
  while (head) {
    if (s.find(head) != s.end())
      return true;
    s.insert(head);
    head = head->next;
  }
  return false;
}