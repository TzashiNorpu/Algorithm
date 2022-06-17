#include "SpecialSubject/ss.h"
#include "GSSY/gssy.h"
using namespace myAlgo;
using namespace GSSY;
#include<iostream>
#include <map>
int main()
{
	LargestRectangleArea_84 ins;
	vector<int> h = { 2,1,5,6,2,3 };
	int res=ins.largestRectangleArea(h);
	cout << res << endl;
}