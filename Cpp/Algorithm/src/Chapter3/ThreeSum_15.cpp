#include "chapter3.h"
#include <algorithm>
vector<vector<int>> myAlgo::ThreeSum_15::threeSum(vector<int>& nums)
{
	vector<vector<int>> result;
	sort(nums.begin(), nums.end());
	size_t n_size = nums.size();
	for (size_t i = 0; i < n_size; i++)
	{
		if (nums[i] > 0) break;
		if (i > 0 && nums[i] == nums[i - 1]) continue;
		size_t l = i + 1;
		size_t r = n_size - 1;
		while (l<r)
		{
			int sum = nums[i] + nums[l] + nums[r];
			if (sum==0)
			{
				result.push_back({ nums[i], nums[l], nums[r] });
				while (l < r && nums[l] == nums[l + 1]) l++;
				while (l < r && nums[r] == nums[r - 1]) r--;
				l++;
				r--;
			}
			if (sum > 0) r--;
			if (sum < 0) l++;
		}
	}
	return result;
}