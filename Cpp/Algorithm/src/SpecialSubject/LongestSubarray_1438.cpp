#include "ss.h"
#include <deque>
using namespace myAlgo;
int LongestSubarray_1438::longestSubarray(vector<int>& nums, int limit)
{
	int maxLen = 0;
	deque<int> maxDeque, minDeque;
	for (int l = 0,r=0; r < nums.size(); r++)
	{
		while (!maxDeque.empty() && nums[r] >= nums[maxDeque.back()]) maxDeque.pop_back();
		maxDeque.push_back(r);
		while (!minDeque.empty() && nums[r] <= nums[minDeque.back()]) minDeque.pop_back();
		minDeque.push_back(r);
		while (abs(nums[maxDeque.front()] - nums[minDeque.front()])>limit)
		{
			l++;
			if (maxDeque.front() < l) maxDeque.pop_front();
			if (minDeque.front() < l) minDeque.pop_front();
		}
		maxLen = max(maxLen, r - l + 1);
	}
	return maxLen;
}