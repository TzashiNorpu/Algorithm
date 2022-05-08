#include "ss.h"
#include <iostream>
int myAlgo::LengthOfLongestSubstring_3::lengthOfLongestSubstring(string s) {
	int begin = 0;
	int maxLen = 0;
	unordered_map<char, int> lastOccurred;
	for (size_t i = 0; i < s.size(); i++)
	{
		char c = s[i];
		// ��ǰ�ַ�֮ǰ���ֹ��ҳ���λ���ڱ��Ӵ�����ʵλ��֮�� -> ��ǰ�Ӵ������ظ��ַ���������ʼλ��
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

