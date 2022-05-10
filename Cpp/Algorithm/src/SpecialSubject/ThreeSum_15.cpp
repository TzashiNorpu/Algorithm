#include "ss.h"
#include <algorithm>
vector<vector<int>> myAlgo::ThreeSum_15::threeSum(vector<int>& nums) {
	int n = nums.size();
	sort(nums.begin(), nums.end());
	vector<vector<int>> ans;
	for (int i = 0; i < n; i++)
	{
		if (nums[i] > 0) return ans;
		if (i > 0 && nums[i] == nums[i - 1]) continue;
		int l = i + 1;
		int r = n - 1;
		while (l < r)
		{
			if (nums[i] + nums[l] + nums[r] == 0) 
			{
				ans.push_back({ nums[i],nums[l],nums[r] });
				while (l < r && nums[l] == nums[l + 1]) l++;
				while (l < r && nums[r] == nums[r - 1]) r--;
				l++;
				r--;
			}
			else if(nums[i] + nums[l] + nums[r]>0)
			{
				r--;
			}
			else 
			{
				l++;
			}
		}
	}
	return ans;
}