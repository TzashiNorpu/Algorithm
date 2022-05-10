#include "ss.h"
unordered_map<char, vector<char>> map = {
		{'2',{'a','b','c'}},
		{'3',{'d','e','f'}},
		{'4',{'g','h','i'}},
		{'5',{'j','k','l'}},
		{'6',{'m','n','o'}},
		{'7',{'p','r','q','s'}},
		{'8',{'t','u','v'}},
		{'9',{'w','x','y','z'}},
};

vector<string> myAlgo::LetterCombinations_17::letterCombinations(string digits)
{
	int deep=digits.size();
	vector<string> res;
	recursive(0,deep,res,"",digits);
	return res;
}

void recursive(int level, int deep, vector<string>& res, string temp, string digits)
{
	if (level == deep)
	{
		res.push_back(temp);
		return;
	}
	recursive(level + 1, deep, res, temp.append(digits[level] + ""), digits);
}