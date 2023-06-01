//
// Created by tseringnorpu on 6/1/2023.
//
#include "../../header/header.h"
using namespace labuladong;

ListNode *Solution::getKthFromEnd(ListNode *head, int k) {
    auto l = head;
    auto r = head;
    while (--k > 0) {
        r = r->next;
    }
    while (r&&r->next) {
        r = r->next;
        l = l->next;
    }
    return l;
}
