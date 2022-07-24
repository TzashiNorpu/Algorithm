#include "Header.h"
using namespace myAlgo;
int numWays_1573::numWays(string s) {
	int tot = 0;
	int MOD = 1000000007;
	int n = s.size();
	map<int, int> count;
	int res = 0;
	for (int i = 0; i <n; i++) {
		if (s[i]=='1')
		{
			tot++;
			count[tot] = i;
		}
	}
	if (tot % 3 != 0) return 0;
	if (tot == 0) return (n - 1) * (n - 2) / 2 % MOD;
	int target = tot / 3;
	return (long)(count[target+1]-count[target])*(long)(count[target*2+1]-count[target*2]) % MOD;
}
