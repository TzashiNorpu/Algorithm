#include "header.h"

using namespace ZeroTrac;
int atMost(vector<int>& A, int k) {
  int res = 0, i = 0, n = A.size();
  for (int j = 0; j < n; j++) {
    k -= A[j] % 2;
    while (k < 0)
      k += A[i++] % 2;
      res += j - i + 1;
    }
    return res;
}

int Solution::numberOfSubarrays_1248(vector<int>& nums, int k) {
  // 2,2,2,1,2,2,1,2,2,2
  // [2,2,2] 1,2,2,1        4
  // [2,2,2] 1,2,2,1,2      4
  // [2,2,2] 1,2,2,1,2,2    4
  // [2,2,2] 1,2,2,1,2,2,2  4
  int res=0;
  
  return res;
}