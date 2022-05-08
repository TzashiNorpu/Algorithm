#include "ss.h"
#include <iostream>
int myAlgo::LengthOfLongestSubstring_3::lengthOfLongestSubstring(string s) {
	int begin = 0;
	int maxLen = 0;
	unordered_map<char, int> lastOccurred;
	for (size_t i = 0; i < s.size(); i++)
	{
		char c = s[i];
		// 当前字符之前出现过且出现位置在本子串的其实位置之后 -> 当前子串中有重复字符，更新起始位置
		if (lastOccurred.find(c)!=lastOccurred.end() && lastOccurred[c] >= begin)
		{
			begin = lastOccurred[c] + 1;
		}
		if (i-begin+1>maxLen)
		{
			maxLen = i - begin + 1;
		}
		lastOccurred[c] = i;
	}
	return maxLen;
}

