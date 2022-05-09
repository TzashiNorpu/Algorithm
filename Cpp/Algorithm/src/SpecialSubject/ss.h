#pragma once
#include "../ListNode.h"
#include<vector>
#include <string>
#include <unordered_map>
#include <math.h>
using namespace std;
namespace myAlgo {
	class AddTwoNumbers_2 {
	public:
		ListNode* addTwoNumbers_2(ListNode* l1, ListNode* l2);
	};
	class LengthOfLongestSubstring_3 {
	public:
		int lengthOfLongestSubstring(string s);
	};
	class FindMedianSortedArrays_4 {
	public:
		double findMedianSortedArraysReverse(vector<int>& nums1, vector<int>& nums2);
		double findMedianSortedArraysBinarySearch(vector<int>& nums1, vector<int>& nums2);
	};
	class LongestPalindrome_5 {
	public:
		string longestPalindrome(string s);
	};
	class Reverse_7 {
	public:
		int reverse(int x);
	};
	class MyAtoi_8 {
		int myAtoi(string s);
	};
}