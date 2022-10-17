//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::getIntersectionNode(ListNode *headA, ListNode *headB) {
  ListNode *p1 = headA, *p2 = headB;
  // null == null : true
  while (p1 != p2) {
    if (p1) p1 = p1->next;
    else p1 = headB;
    if (p2) p2 = p2->next;
    else p2 = headA;
  }
  return p1;
}