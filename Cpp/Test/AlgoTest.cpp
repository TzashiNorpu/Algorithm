#include "pch.h"
#include "../Algorithm/src/Chapter3/chapter3.h"
namespace myTest {
	TEST(twoSumTest, postive) {
		vector<int> nums = { 2, 7, 11, 15 };
		int target = 9;
		vector<int> res = { 0,1 };
		myAlgo::TwoSum_1 ins;
		EXPECT_EQ(ins.twoSum(nums, target), res);
	}

	TEST(reverseKGroup, postive) {
		ListNode* head = &ListNode(1);
		head->next = &ListNode(2);
		head->next->next = &ListNode(3);
		head->next->next->next = &ListNode(4);
		head->next->next->next->next = &ListNode(5);
		int k = 2;
		ListNode* res = &ListNode(2);
		res->next = &ListNode(1);
		res->next->next = &ListNode(4);
		res->next->next->next = &ListNode(3);
		res->next->next->next->next = &ListNode(5);
		myAlgo::ReverseKGroup_25 ins;
		ListNode* tmp=ins.reverseKGroup(head, k);
		while (tmp) {
			cout<< tmp->val<<endl;
			tmp = tmp->next;
		}
	}
	int main(int argc, char** argv) {
		::testing::InitGoogleTest(&argc, argv);
		return RUN_ALL_TESTS();
	}
}


