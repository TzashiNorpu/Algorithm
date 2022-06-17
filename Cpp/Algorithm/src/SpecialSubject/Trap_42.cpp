#include "ss.h"
int myAlgo::Trap_42::trap(vector<int>& height)
{
    vector<int> stack;
    /*输入：height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
        输出：6*/
        // 递减索引队列
    int res = 0;
    for (int i = 0; i < height.size(); i++)
    {
        while (stack.size() > 1 && height[i] > height[stack.back()])
        {
            /* code */
            int rightIndex = i;
            int popIndex = stack.back();
            stack.pop_back();
            int leftIndex = stack.back();
            int h = min(height[leftIndex],  height[rightIndex]) - height[popIndex];
            int area = (rightIndex - leftIndex - 1) * max(h,0);
            res += area;
        }
        stack.push_back(i);
    }
    return res;
}