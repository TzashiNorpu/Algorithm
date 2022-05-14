#include "ss.h"
//Input: digits = "23"
//Output : ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]


vector<string> myAlgo::LetterCombinations_17::letterCombinations(string digits)
{
	int deep=digits.size();
	vector<string> res;
	unordered_map<char, string> map = {
		{'2',"abc"},
		{'3',"def"},
		{'4',"ghi"},
		{'5',"jkl"},
		{'6',"mno"},
		{'7',"pqrs"},
		{'8',"tuv"},
		{'9',"wxyz"},
	};
	string combination;
	recursive(0,deep,map,res,combination,digits);
	return res;
}

void myAlgo::LetterCombinations_17::recursive(int level, int deep, unordered_map<char, string>& map,vector<string>& res, string& temp, string digits)
{
	if (level == deep)
	{
		res.push_back(temp);
		return;
	}
	char c = digits[level]; 
	const string& letters = map.at(c);
	for (const char& letter:letters)
	{
		temp.push_back(letter);
		recursive(level + 1, deep, map,res,temp , digits);
		temp.pop_back();
	}
	
}