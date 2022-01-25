#include "chapter3.h"
ListNode* myAlgo::ReverseKGroup_25::reverseKGroup(ListNode* head, int k)
{
	ListNode* dummyHead = new ListNode(0);;
	dummyHead->next = head;
	ListNode* prev = dummyHead;
	ListNode* kStart = head;
	ListNode* kEnd = head;
	ListNode* nxtKstart = head;
	while (kEnd)
	{
		for (size_t i = 0; i < k - 1 && kEnd != NULL; i++)
		{
			kEnd = kEnd->next;
		}
		if (kEnd == NULL)
		{
			prev->next = kStart;
			break;
		}
		nxtKstart = kEnd->next;
		kEnd->next = NULL;
		reverse(kStart);
		prev->next = kEnd;
		prev = kStart;
		kStart = nxtKstart;
		kEnd = kStart;
	}
	delete dummyHead;
	return dummyHead->next;
}

ListNode* myAlgo::ReverseKGroup_25::reverse(ListNode* head)
{
	if (head == NULL || head->next == NULL)
	{
		return head;
	}
	ListNode* newHead = reverse(head->next);
	head->next->next = head;
	head->next = NULL;
	return newHead;
}
