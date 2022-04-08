#include "chapter3.h"
ListNode*  myAlgo::ReverseList_206::reverseList(ListNode* head)
{
	ListNode* prev = NULL;
	ListNode* curr = head;
	while (curr!=NULL)
	{
		ListNode* next =curr->next;
		curr->next = prev;
		prev = curr;
		curr = next;
	}
	return prev;
}