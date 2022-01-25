#include "../Chapter3/chapter3.h"
void myAlgo::Merge_88::merge(vector<int>& nums1, int m, vector<int>& nums2, int n)
{
	vector<int> tmp;
	for (size_t i = 0; i < m; i++)
	{
		tmp.push_back(nums1[i]);
	}
	for (int i = 0, j = 0; (i + j) < (m + n); )
	{
		if (j == n || (i != m && tmp[i] < nums2[j]))
		{
			nums1[i + j] = tmp[i];
			i++;
		}
		else
		{
			nums1[i + j] = nums2[j];
			j++;
		}
	}
}