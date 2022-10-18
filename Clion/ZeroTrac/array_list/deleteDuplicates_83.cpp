//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::deleteDuplicates(ListNode *head) {
  ListNode *dummy = new ListNode();
  dummy->next = head;
  if (!head) return dummy->next;
  ListNode *slow = head, *fast = head->next;
  while (fast) {
    if (fast->val == slow->val)
      fast = fast->next, slow->next = fast;
    else fast = fast->next, slow = slow->next;
  }
  return dummy->next;
}