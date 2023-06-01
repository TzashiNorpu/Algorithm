//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::getIntersectionNode(ListNode *headA, ListNode *headB) {
  ListNode *A = headA;
  ListNode *B = headB;
  while (A != B) {
    A = A == nullptr ? headB : A->next;
    B = B == nullptr ? headA : B->next;
  }
  return A;
}