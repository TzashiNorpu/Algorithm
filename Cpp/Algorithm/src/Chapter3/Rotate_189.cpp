#include "../Chapter3/chapter3.h"
void myAlgo::Rotate_189::rotate(vector<int>& nums, int k)
{
	int size = nums.size();
	k = k % size;
	reverse(nums,0,size-1);
	reverse(nums,0,k-1);
	reverse(nums,k,size-1);
}

void myAlgo::Rotate_189::reverse(vector<int>& nums,int start,int end)
{
	while (start<end)
	{
		swap(nums[start],nums[end]);
		start++;
		end--;
	}
}