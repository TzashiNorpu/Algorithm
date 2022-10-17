//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::detectCycle(ListNode *head) {
  /*
   * 环的起点和相遇点不是同一个位置
   * 起点是指定的
   */
  ListNode *s1 = head, *s2 = head, *f = head;
  while (f && f->next) {
    s1 = s1->next;
    f = f->next->next;
    if (s1 == f) {
      while (s1 != s2)
        s1 = s1->next, s2 = s2->next;
      return s2;
    }
  }
  return nullptr;
}