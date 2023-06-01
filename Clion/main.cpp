#include <iostream>
#include "labuladong/header/header.h"

using namespace labuladong;

int main() {
  auto t = new labuladong::Solution();
  auto h1 = new ListNode(1);
  h1->next = new ListNode(2);
  h1->next->next = new ListNode(3);
  h1->next->next->next = new ListNode(4);
  h1->next->next->next->next = new ListNode(5);

  auto r = t->removeNthFromEnd(h1, 2);
  while (r) {
    printf("%d ", r->val);
    r = r->next;
  }
  printf("\n");
  return 0;
}
