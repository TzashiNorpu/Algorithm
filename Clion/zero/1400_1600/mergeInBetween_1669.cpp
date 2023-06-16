//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

ListNode *Solution::mergeInBetween(ListNode *list1, int a, int b, ListNode *list2) {
  ListNode *start, *end;
  ListNode *l1 = list1;
  int pos = 1;
  while (l1) {
    if (pos == a) start = l1;
    if (pos == b + 1) {
      end = l1;
      break;
    }
    l1 = l1->next;
    pos++;
  }
  ListNode *l2 = list2;
  while (l2->next) l2 = l2->next;
  start->next = list2;
  l2->next = end->next;
  return list1;

}