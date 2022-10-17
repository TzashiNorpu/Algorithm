//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::addTwoNumbers(ListNode *l1, ListNode *l2) {
  ListNode *dummy = new ListNode();
  ListNode *p = dummy;
  int carry = 0;
  while (l1 || l2) {
    int sum = carry;
    if (l1) sum += l1->val, l1 = l1->next;
    if (l2) sum += l2->val, l2 = l2->next;
    p->next = new ListNode(sum % 10);
    carry = sum / 10;
    p = p->next;
  }
  if (carry == 1) p->next = new ListNode(carry);
  return dummy->next;
}