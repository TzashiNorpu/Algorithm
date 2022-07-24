#pragma once
#include "../ListNode.h"
#include <vector>
#include <string>
#include <unordered_map>
#include <math.h>
using namespace std;
namespace myAlgo
{
	class AddTwoNumbers_2
	{
	public:
		ListNode *addTwoNumbers_2(ListNode *l1, ListNode *l2);
	};
	class LengthOfLongestSubstring_3
	{
	public:
		int lengthOfLongestSubstring(string s);
	};
	class FindMedianSortedArrays_4
	{
	public:
		double findMedianSortedArraysReverse(vector<int> &nums1, vector<int> &nums2);
		double findMedianSortedArraysBinarySearch(vector<int> &nums1, vector<int> &nums2);
	};
	class LongestPalindrome_5
	{
	public:
		string longestPalindrome(string s);

	private:
		int findPalindrome(string s, int l, int r);
	};
	class Reverse_7
	{
	public:
		int reverse(int x);
	};
	class MyAtoi_8
	{
		int myAtoi(string s);
	};
	class LongestSubarray_1438
	{
	public:
		int longestSubarray_1(vector<int> &nums, int limit);
	};
	class LongestCommonPrefix_14
	{
	public:
		string longestCommonPrefix(vector<string> &strs);
	};
	class IsMatch_10
	{
	public:
		bool isMatch(string s, string p);
	};
	class ThreeSum_15
	{
	public:
		vector<vector<int>> threeSum(vector<int> &nums);
	};
	class LetterCombinations_17
	{
	private:
		void recursive(int level, int deep, unordered_map<char, string> &map, vector<string> &res, string &temp, string digits);

	public:
		vector<string> letterCombinations(string digits);
	};
	class RemoveNthFromEnd_19
	{
	public:
		ListNode *removeNthFromEnd(ListNode *head, int n);
	};
	class GenerateParenthesis_22
	{
	private:
		void backtrack(vector<string> &res, string &temp, int l, int r, int n);

	public:
		vector<string> generateParenthesis(int n);
	};
	class MergeKLists_23
	{
	public:
		ListNode *mergeKLists(vector<ListNode *> &lists);
	};
	class TotalSteps_2289
	{
	public:
		int totalSteps(vector<int> &nums);
	};
	class Trap_42
	{
	public:
		int trap(vector<int> &height);
	};
	class LargestRectangleArea_84
	{
	public:
		int largestRectangleArea(vector<int>& heights);
	};
}