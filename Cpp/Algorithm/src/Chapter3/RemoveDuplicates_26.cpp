#include "chapter3.h"
int myAlgo::RemoveDuplicates_26::removeDuplicates(vector<int>& nums)
{
	int size=nums.size();
	if (size!=0)
	{
		int loc = 0;
		for (size_t i = loc+1; i < size; i++)
		{
			if (nums[loc]!=nums[i])
			{
				nums[++loc] = nums[i];
			}
		}
		return loc + 1;
	}
	return 0;
}