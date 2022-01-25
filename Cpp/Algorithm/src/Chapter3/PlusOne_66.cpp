#include "../Chapter3/chapter3.h"

vector<int> myAlgo::PlusOne_66::plusOne(vector<int>& digits)
{	
	vector<int> res;
	int carry = 1;
	for (int i = digits.size()-1; i >=0; i--)
	{
		res.insert(res.begin(), (digits[i] + carry) % 10);
		carry = (digits[i] + carry) / 10;
	}
	if (carry==1)
	{
		res.insert(res.begin(), 1);
	}
	return res;
}