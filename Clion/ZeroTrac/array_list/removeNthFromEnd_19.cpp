//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::removeNthFromEnd(ListNode *head, int n) {
  ListNode *dummy = new ListNode();
  dummy->next = head;
  ListNode *p = dummy, *prev = dummy;
  int k = n + 1;
  while (p) {
    while (k-- > 0)
      p = p->next;
    if (p)
      p = p->next, prev = prev->next;
  }
  prev->next = prev->next->next;
  return dummy->next;
}