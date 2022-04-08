#include "chapter3.h"
ListNode* myAlgo::SwapPairs_24::swapPairs(ListNode* head) {
	ListNode* dummyHead = new ListNode(0);
	dummyHead->next = head;
	// 1->2->3->4 => 2->1->3->4 => 2->1->4->3
	// 1->2 => 2->1
	ListNode* prev = dummyHead;
	ListNode* curr = head;
	while (curr!=NULL && curr->next!=NULL)
	{
		ListNode* next =curr->next;
		ListNode* nNext = next->next;

		prev->next = next;
		next->next = curr;
		curr->next = nNext;
		prev = curr;
		curr = nNext;

	}
	return dummyHead->next;
}