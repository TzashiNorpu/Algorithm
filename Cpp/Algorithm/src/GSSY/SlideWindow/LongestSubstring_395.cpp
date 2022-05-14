#include "../gssy.h"
using namespace GSSY;
int LongestSubstring_395::longestSubstring(string s, int k) {
	int ans=0;
	int len = s.size();
	int cnt[26];
	for(int p=1;p<=26;p++){
		memset(cnt, 0, sizeof(cnt));
		for (int i = 0, j = 0, tot = 0, sum = 0; i < len;i++) {
			int c = s[i]-'a';
			cnt[c]++;
			if (cnt[c] == 1) tot++;
			if (cnt[c] == k) sum++;
			while (tot > p) {
				int t = s[j++] - 'a';
				cnt[t]--;
				if (cnt[t] == 0) tot--;
				if (cnt[t] == k - 1) sum--;
			}
			if (tot == sum) ans = max(ans, i - j + 1);
		}
	}
	return ans;
}