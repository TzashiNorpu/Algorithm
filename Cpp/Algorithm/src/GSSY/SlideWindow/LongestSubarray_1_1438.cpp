#include"../gssy.h"
#include <deque>
using namespace GSSY;
int LongestSubarray_1_1438::longestSubarray(vector<int>& nums, int limit) {
	deque<int> max_idx, min_idx;
	int len = nums.size();
	int res = 0;
	for (int l = 0, r = 0;r<len;r++) {
		while (!max_idx.empty() && nums[r] >= nums[max_idx.back()]) max_idx.pop_back();
		max_idx.push_back(r);
		while (!min_idx.empty() && nums[l] <= nums[min_idx.back()]) min_idx.pop_back(); 
		min_idx.push_back(l);
		while (abs(nums[max_idx.front()] - min_idx.front()) > limit) {
			l++;
			if (max_idx.front() < l) max_idx.pop_front();
			if (min_idx.front() < l) min_idx.pop_front();
		}
		res = max(res, r - l + 1);
	}
	return res;
}
