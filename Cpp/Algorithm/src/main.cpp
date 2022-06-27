#include "SpecialSubject/ss.h"
#include "GSSY/gssy.h"
#include "SpecialSubject/Graph/graph.h"
using namespace myAlgo;
using namespace GSSY;
#include<iostream>
#include <map>
int main()
{
	MinimumScore_2322 ins;
	vector<int> nums = {1,5,5,4,11};
	vector<vector<int>> edges = { {0,1},{1,2},{1,3},{3,4} };
	int res=ins.minimumScore(nums,edges);
	printf("res=%d",res);
}