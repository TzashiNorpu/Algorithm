#include "ss.h"
vector<string> myAlgo::GenerateParenthesis_22::generateParenthesis(int n)
{
	vector<string> res;
	string s="";
	int l = 0, r = 0;
	backtrack(res, s,l,r,n);
	return res;
}

void myAlgo::GenerateParenthesis_22::backtrack(vector<string>& res, string& temp, int l, int r, int n)
{
	if (l == n && r == n) {
		res.push_back(temp);
		return;
	}
	if (l >= r && l<n) {
		temp.push_back('(');
		backtrack(res, temp, l + 1, r, n);
		temp.pop_back();
	} 
	if (r<l && r < n) {
		temp.push_back(')');
		backtrack(res, temp, l , r+1, n);
		temp.pop_back();
	}
}