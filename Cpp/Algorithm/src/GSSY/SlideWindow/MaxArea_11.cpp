#include "../gssy.h"
using namespace GSSY;
int MaxArea_11::maxArea(vector<int>& height) {
	int ans = 0;
	int len = height.size() - 1;
	for (int l = 0, r = len - 1; l < r;) {
		int h = height[l] < height[r] ? height[l++] : height[r--];
		int area = (r - l + 1) * h;
		ans = max(ans, area);
	}
	return ans;
}