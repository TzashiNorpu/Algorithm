//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::mergeTwoLists(ListNode *list1, ListNode *list2) {
  auto dummy = new ListNode(-2);
  auto x = new ListNode(-1);
  dummy->next = x;
  while (list1 && list2) {
    if (list1->val < list2->val) {
      x->next = list1;
      list1 = list1->next;
    } else {
      x->next = list2;
      list2 = list2->next;
    }
    x = x->next;
  }
  if (list2) { x->next = list2; }
  if (list1) { x->next = list1; }
  return dummy->next->next;
}