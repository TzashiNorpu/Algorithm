#include "header.h"
using namespace ZeroTrac;
vector<int> pancakeSort_969::pancakeSort(vector<int>& arr){
  vector<int> res;
  for(int i=arr.size();i>1;i--){
    int index = max_element(arr.begin(),arr.begin()+i)- arr.begin();;
    if(index==i-1) continue;
    reverse(arr.begin(),arr.begin()+index+1);
    reverse(arr.begin(),arr.begin()+i);
    res.push_back(index+1);
    res.push_back(i);
  }
  return res;
}
