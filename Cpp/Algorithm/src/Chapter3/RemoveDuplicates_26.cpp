#include "chapter3.h"
int myAlgo::RemoveDuplicates_26::removeDuplicates(vector<int>& nums)
{
	int i = 0;
	int size=nums.size();
	for (size_t j = 1; j < size; j++)
	{
		if (nums[i]!=nums[j])
		{
			nums[++i] = nums[j];
		}
	}
	return i + 1;
}