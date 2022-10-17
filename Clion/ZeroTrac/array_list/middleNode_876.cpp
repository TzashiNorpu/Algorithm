//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::middleNode(ListNode *head) {
  ListNode *slow = head, *fast = head;
  while (fast && fast->next) {
    slow = slow->next;
    fast = fast->next->next;
  }
  return slow;
}