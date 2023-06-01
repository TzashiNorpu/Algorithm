//
// Created by TzashiNorpu on 5/31/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::removeNthFromEnd(ListNode *head, int n) {
  if (!head)return nullptr;
  auto *dummy = new ListNode(-1);
  dummy->next = head;
  ListNode *r = dummy;
  ListNode *l = dummy;
  while (n--) {
    r = r->next;
  }
  while (r && r->next) {
    r = r->next;
    l = l->next;
  }
  l->next = l->next->next;
  return dummy->next;
}