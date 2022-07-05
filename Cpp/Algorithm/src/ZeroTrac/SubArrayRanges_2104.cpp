#include "Header.h"
long long myAlgo::SubArrayRangers_2104::subArrayRanges(vector<int>& nums) {
	return maxSum(nums) - minSum(nums);
}
long long maxSum(vector<int>& nums) {
	vector<int> stack;
	long long sum = 0;
	stack.push_back(-1);
	for (size_t i = 0; i < nums.size(); i++)
	{
		// µ¥µ÷µÝ¼õ
		while (stack.size()>1 && nums[i]>nums[stack.front()])
		{

		}
		stack.push_back(i);

	}
	return sum;
}

long long minSum(vector<int>& nums) {

}