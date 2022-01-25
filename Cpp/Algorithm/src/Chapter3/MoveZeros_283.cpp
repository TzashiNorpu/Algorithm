#include "../Chapter3/chapter3.h"

void myAlgo::MoveZeros_283::moveZeroes(vector<int>& nums)
{
	// 0,1,0,3,12->1,3,12,0,0
	int loc = 0;
	for (int i = 0; i < nums.size(); i++)
	{
		if (nums[i])
		{
			nums[loc] = nums[i];
			if (loc!=i)
			{
				nums[i] = 0;
			}
			loc++;
		}
	}
}