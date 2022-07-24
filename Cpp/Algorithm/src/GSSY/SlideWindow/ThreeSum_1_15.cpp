#include "../gssy.h"
#include <algorithm>
using namespace GSSY;
vector<vector<int>> ThreeSum_1_15::threeSum(vector<int>& nums) {
	// ȷ����һ�����͵ڶ����������ظ������ɱ�֤��Ԫ�鲻�ظ�
	int len=nums.size();
	vector<vector<int>> res;
	sort(nums.begin(), nums.end());
	for (size_t i = 0; i < len; i++)
	{	
		if (nums[i] > 0) return res;
		if (i > 0 && nums[i] == nums[i - 1]) continue;
		for (int l = i + 1, r = len - 1; l < r;l++) {
			if (l > i + 1 && nums[l] == nums[l - 1]) continue;
			// r-1>lʱ�ұ߻�����������ƶ�һ��λ��
			while (r-1>l&&nums[i] + nums[l] + nums[r] > 0) r--;
			if (nums[i] + nums[l] + nums[r] == 0) res.push_back({nums[i],nums[l],nums[r]});
		}
	}
	return res;
}