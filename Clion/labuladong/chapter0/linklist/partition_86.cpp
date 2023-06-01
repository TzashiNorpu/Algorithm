//
// Created by TzashiNorpu on 6/1/2023.
//
#include "../../header/header.h"

using namespace labuladong;

ListNode *Solution::partition(ListNode *head, int x) {
  auto dummy1 = new ListNode(-1);
  auto dummy2 = new ListNode(-1);
  auto p1 = dummy1;
  auto p2 = dummy2;
  while (head) {
    if (head->val < x) {
      p1->next = head;
      p1 = p1->next;
    } else {
      p2->next = head;
      p2 = p2->next;
    }
    ListNode *tmp = head->next;
    head->next = nullptr;
    head = tmp;
  }
  p1->next = dummy2->next;
  return dummy1->next;
}
