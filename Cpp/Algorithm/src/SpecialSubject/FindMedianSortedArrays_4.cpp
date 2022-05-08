#include "ss.h"
double myAlgo::FindMedianSortedArrays_4::findMedianSortedArraysReverse(vector<int>& nums1, vector<int>& nums2) {
	int n=nums1.size();
	int m=nums2.size();
	int left = (n + m + 1) / 2;
	int right = (n + m + 2) / 2;
	return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
}

int getKth(vector<int>& nums1, int start1, int end1, vector<int>& nums2, int start2, int end2, int k) {
	int len1 = end1 - start1+1;
	int len2 = end2 - start2+1;
	if (len1 > len2) {
		return getKth(nums2, start2, end2, nums1, start1, end1, k);
	}
	if (len1==0)
	{
		return nums2[start2 + k-1];
	}
	if (k==1)
	{
		return fmin(nums1[start1], nums2[start2]);
	}
		
	int i = start1 + fmin(len1, k / 2) - 1;
	int j = start2 + fmin(len2, k / 2) - 1;
	if (nums1[i]>nums2[j])
	{
		return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
	}
	else
	{
		return getKth(nums1, i+1, end1, nums2, start2, end2, k - (i - start1 + 1));
	}
}

double myAlgo::FindMedianSortedArrays_4::findMedianSortedArraysBinarySearch(vector<int>& nums1, vector<int>& nums2) {
	int m = nums1.size();
	int n = nums2.size();
	if (m > n)
	{
		return findMedianSortedArraysBinarySearch(nums2, nums1);
	}
	int left = 0, right = m;
	// median1：前一部分的最大值
	// median2：后一部分的最小值
	int median1 = 0, median2 = 0;
	while (left <= right) {
		// 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
		// 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
		int i = (left + right) / 2;
		int j = (m + n + 1) / 2 - i;
		// nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
		int nums_im1 = i == 0 ? INT_MIN : nums1[i - 1];
		int nums_i = i == m ? INT_MAX : nums1[i];
		int nums_jm1 = j == 0 ? INT_MIN : nums2[j - 1];
		int nums_j = j == n ? INT_MAX : nums2[j];
		// nums1[i-1]<=num2[j] && nums2[j-1] <=nums1[i]
		if (nums_im1 <= nums_j)
		{
			median1 = max(nums_im1, nums_jm1);
			median2 = min(nums_i, nums_j);
			left = i + 1;
		}
		else
		{
			right = i - 1;
		}
	}
	return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
}