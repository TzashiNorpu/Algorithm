//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

bool Solution::hasCycle(ListNode *head) {
  /*ListNode *slow = head, *fast = head;
  while (fast && fast->next) {
    slow = slow->next;
    fast = fast->next->next;
    if (slow == fast) return true;
  }
  return false;*/
  unordered_set<ListNode *> s;
  while (head) {
    if (s.find(head) != s.end()) return true;
    s.insert(head);
    head = head->next;
  }
  return false;
}