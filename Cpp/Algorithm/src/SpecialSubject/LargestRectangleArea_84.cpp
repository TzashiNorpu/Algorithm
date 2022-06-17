#include "ss.h"

int myAlgo::LargestRectangleArea_84::largestRectangleArea(vector<int>& heights) {
	// 单调递增队列
	vector<int> stack;
	int res = 0;
	heights.push_back(-1);
	stack.push_back(-1);
	for (size_t i = 0; i < heights.size(); i++)
	{
		while (stack.size()>1 && heights[i] <= heights[stack.back()])
		{
			int popIndex = stack.back();
			stack.pop_back();
			int leftIndex = stack.back();
			int rightIndex = i;
			int area = (rightIndex - leftIndex - 1) * heights[popIndex];
			res = max(area, res);
		}
		stack.push_back(i);
	}
	return res;
}