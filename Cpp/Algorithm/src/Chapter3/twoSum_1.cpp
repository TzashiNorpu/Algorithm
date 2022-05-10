#include "chapter3.h"
using namespace myAlgo;
vector<int> TwoSum_1::twoSum(vector<int>& nums, int target)
{
	unordered_map<int, int> hashtable;
	for (int i = 0; i < nums.size(); ++i) {
		auto it = hashtable.find(target - nums[i]);
		if (it != hashtable.end()) {
			return { it->second, i };
		}
		hashtable[nums[i]] = i;
	}
	return {};
}




