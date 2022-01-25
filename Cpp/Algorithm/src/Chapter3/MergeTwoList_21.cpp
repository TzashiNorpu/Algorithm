#include "../Chapter3/chapter3.h"
ListNode* myAlgo::MergeTwoLists_21::mergeTwoLists(ListNode* list1, ListNode* list2)
{
	if (list1 == NULL || list2 == NULL)
	{
		if (list1 == NULL)
		{
			return list2;
		}
		if (list2 == NULL)
		{
			return list1;
		}
	}
	ListNode* dummyHead = new ListNode();
	if (list1->val < list2->val)
	{
		dummyHead->next = list1;
	}
	else
	{
		dummyHead->next = list2;
	}
	ListNode* connector = dummyHead;
	while (list1 != NULL && list2 != NULL)
	{
		if (list1->val < list2->val)
		{
			connector->next = list1;
			list1 = list1->next;
		}
		else
		{
			connector->next = list2;
			list2 = list2->next;
		}
		connector = connector->next;
	}
	if (list1 != NULL)
	{
		connector->next = list1;
	}
	if (list2 != NULL)
	{
		connector->next = list2;
	}
	return dummyHead->next;
}