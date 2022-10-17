//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::mergeTwoLists(ListNode *list1, ListNode *list2) {
  ListNode *dummyNode = new ListNode;
  ListNode *p = dummyNode;
  while (list1 && list2) {
    if (list1->val < list2->val)
      p->next = list1, list1 = list1->next;
    else
      p->next = list2, list2 = list2->next;
    p = p->next;
  }
  if (list1) p->next = list1;
  if (list2) p->next = list2;
  return dummyNode->next;
}