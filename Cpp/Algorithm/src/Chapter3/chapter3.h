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
}
