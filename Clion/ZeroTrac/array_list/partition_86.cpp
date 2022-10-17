//
// Created by TzashiNorpu on 10/17/2022.
//
#include "array_list.h"

using namespace Array_List;

ListNode *Solution::partition(ListNode *head, int x) {
  // 存放小于 x 的链表的虚拟头结点 存放大于等于 x 的链表的虚拟头结点
  ListNode *dummy1 = new ListNode(), *dummy2 = new ListNode();
  // p1, p2 指针负责生成结果链表
  ListNode *l = dummy1, *h = dummy2;
  // p 负责遍历原链表，类似合并两个有序链表的逻辑
  ListNode *p = head;
  while (p) {
    if (p->val < x) l->next = p, l = l->next;
    else h->next = p, h = h->next;
    ListNode *tmp = p->next;
    p->next = nullptr;
    p = tmp;
  }
  l->next = dummy2->next;
  return dummy1->next;
}