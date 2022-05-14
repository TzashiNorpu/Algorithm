#include "ss.h"
ListNode* myAlgo::RemoveNthFromEnd_19::removeNthFromEnd(ListNode* head, int n)
{
	// one pass
	// Maintain two pointersand update one with a delay of n steps.
	ListNode* dummyHead=new ListNode(0,head);
	ListNode* p1 = head;
	// prev delete
	ListNode* p2 = dummyHead;
	while (n--) p1 = p1->next;
	while (p1)
	{
		p1 = p1->next;
		p2 = p2->next;
	}
	p2->next = p2->next->next;
	ListNode* ans = dummyHead->next;
	delete dummyHead;
	return ans;
}