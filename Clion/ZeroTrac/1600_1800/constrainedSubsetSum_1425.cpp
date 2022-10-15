#include "header.h"

using namespace ZeroTrac;

int Solution::constrainedSubsetSum(vector<int> &A, int k)
{
    int n = A.size();
    if (n == 0)
        return 0;
    vector<int> sum(n);
    deque<int> dq;
    int res = sum[0];
    for (int i = 0; i < n; i++)
    {
        sum[i] = A[i];
    }
    return res;
}
