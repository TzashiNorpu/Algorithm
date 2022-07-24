#include "header.h"

using namespace ZeroTrac;
int numSubarraysWithSum_930::numSubarraysWithSum(vector<int>& nums, int goal){
  unordered_map<int,int> map;
  int sum=0;
  int res=0;
  for(int num:nums){
    // 当前元素之前的前缀和情况
    map[sum]++;
    sum+=num;
    res +=map[sum-goal];
  }
  return res;
}
