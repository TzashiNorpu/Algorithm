#include "chapter4.h"

bool myAlgo::IsValid_20::isValid(string s)
{
	int n = s.size();
	if (n % 2 == 1) {
		return false;
	}
	unordered_map<char, char> map = {
			{')', '('},
			{']', '['},
			{'}', '{'}
	};

	stack<char> stack;
	for (char c : s) {
		// Óöµ½ÁËÓÒ±ßµÄÀ¨ºÅ
		if (map.count(c))
		{
			// top->peek
			if (stack.empty() || stack.top()!=map[c])
			{
				return false;
			}
			stack.pop();
		}
		else
		{
			stack.push(c);
		}
	}
	// "("
	return stack.empty();
}