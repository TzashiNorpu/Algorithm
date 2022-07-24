#pragma once
#include <string>
#include <vector>
using namespace std;
namespace GSSY{
	class LongestSubstring_395 {
	public:
		int longestSubstring(string s, int k);
	};
	class ThreeSum_1_15 {
	public:
		vector<vector<int>> threeSum(vector<int>& nums);
	};
	class ThreeSumClosest_16 {
	public:
		int threeSumClosest(vector<int>& nums, int target);
	};
	class LongestSubarray_1_1438 {
	public:
		int longestSubarray(vector<int>& nums, int limit);
	};
	class MaxArea_11 {
	public:
		int maxArea(vector<int>& height);
	};
	class FourSum_18 {
	public:
		vector<vector<int>> fourSum(vector<int>& nums, int target);
	};
}