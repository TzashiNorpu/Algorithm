//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::detectCycle(ListNode *head) {
  ListNode *slow = head;
  ListNode *fast = head;
  while (fast && fast->next) {
    slow = slow->next;
    fast = fast->next->next;
    if (fast == slow) {
      ListNode *temp = head;
      while (temp != slow) {
        temp = temp->next;
        slow = slow->next;
      }
      return temp;
    }
  }
  return nullptr;
}