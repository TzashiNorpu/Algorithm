#include "Header.h"

int myAlgo::FirstMissingPositive_41::firstMissingPositive(vector<int>& nums) {
	int n = nums.size();
	for (size_t i = 0; i < n; i++)
	{
		if (nums[i]<0)
		{
			nums[i] = n + 1;
		}
	}
	for (size_t i = 1; i < n; i++)
	{
		if (nums[i] < 0)
		{
			return i + 1;
		}
	}
	return 0;

}