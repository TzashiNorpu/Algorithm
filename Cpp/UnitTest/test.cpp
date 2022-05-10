#include "pch.h"
#include "../Algorithm/src/Chapter3/chapter3.h"

TEST(twoSumTest, postive) {
	vector<int> nums = { 2, 7, 11, 15 };
	int target = 9;
	vector<int> res = { 0,1 };
	myAlgo::TwoSum_1 ins;
	EXPECT_EQ(ins.twoSum(nums, target), res);
}