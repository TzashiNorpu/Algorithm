#pragma once
#include<vector>
#include<unordered_map>
#include "../ListNode.h"
using namespace std;
namespace myAlgo {
	class TwoSum_1 {
	public:
		vector<int> twoSum(vector<int>& nums, int target);
	};
	class ReverseKGroup_25 {
	private:
		ListNode* reverse(ListNode* head);
	public:
		ListNode* reverseKGroup(ListNode* head, int k);
	};
	class RemoveDuplicates_26 {
	public:
		int removeDuplicates(vector<int>& nums);
	};
	class Rotate_189 {
		void reverse(vector<int>& nums,int start,int end);
	public:
		void rotate(vector<int>& nums, int k);
	};
	class MergeTwoLists_21 {
	public:
		ListNode* mergeTwoLists(ListNode* list1, ListNode* list2);
	};
	class Merge_88 {
	public:
		void merge(vector<int>& nums1, int m, vector<int>& nums2, int n);
	};
	class MoveZeros_283 {
	public:
		void moveZeroes(vector<int>& nums);
	};
	class PlusOne_66 {
	public:
		vector<int> plusOne(vector<int>& digits);
	};
	class ThreeSum_15 {
	public:
		vector<vector<int>> threeSum(vector<int>& nums);
	};
	class ReverseList_206 {
	public:
		ListNode* reverseList(ListNode* head);
	};
	class SwapPairs_24 {
	public:
		ListNode* swapPairs(ListNode* head);
	};
	class HasCycle_121 {
	public:
		bool hasCycle(ListNode* head);
	};
	class DetectCycle_142 {
	public:
		ListNode* detectCycle(ListNode* head);
	};
	class ReverseKGroup_25 {
	public:
		ListNode* reverseKGroup(ListNode* head, int k);
	};
}
