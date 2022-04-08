#include "chapter3.h"
ListNode* myAlgo::DetectCycle_142::detectCycle(ListNode* head) {
	ListNode* slow2 = head;
	ListNode* slow1 = head;
	ListNode* fast = head;
	while (fast!=NULL && fast->next !=NULL)
	{
		slow1 = slow1->next;
		fast = fast->next->next;
		if (slow1 == fast)
		{
			while (slow1 != slow2)
			{
				slow1 = slow1->next;
				slow2 = slow2->next;
			}
			return slow2;
		}
	}
	return NULL;
}