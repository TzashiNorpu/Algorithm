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
		ListNode* tmp = ins.reverseKGroup(head, k);
		vector<int> get;
		while (tmp)
		{
			get.push_back(tmp->val);
			tmp = tmp->next;
		}
		vector<int> expect;
		while (res)
		{
			expect.push_back(res->val);
			res = res->next;
		}
		EXPECT_EQ(get,expect );
	}
	TEST(removeDuplicates, postive) {
		vector<int> nums = { 1,1,2 };
		int target = 2;
		myAlgo::RemoveDuplicates_26 ins;
		EXPECT_EQ(ins.removeDuplicates(nums), target);
	}

	TEST(rotateTest, postive) {
		vector<int> nums = { 1,2,3,4,5,6 };
		int k = 3;
		vector<int> target = { 4,5,6,1,2,3 };
		myAlgo::Rotate_189 ins;
		ins.rotate(nums, k);
		EXPECT_EQ(nums, target);
	}

	TEST(mergeTest, postive) {
		vector<int> nums1 = { 1,2,3,0,0,0 };
		vector<int> nums2 = { 4,5,6 };
		vector<int> nums3 = { 1,2,3,4,5,6 };
		int m = 3;
		int n = 3;
		myAlgo::Merge_88 ins;
		ins.merge(nums1, m, nums2, n);
		EXPECT_EQ(nums1, nums3);
	}


	TEST(moveZerosTest, postive) {
		vector<int> nums1 = { 0,0,0,1,2,3 };
		vector<int> nums2 = { 1,2,3,0,0,0 };
		int m = 3;
		int n = 3;
		myAlgo::MoveZeros_283 ins;
		ins.moveZeroes(nums1);
		EXPECT_EQ(nums1, nums2);
	}

}


