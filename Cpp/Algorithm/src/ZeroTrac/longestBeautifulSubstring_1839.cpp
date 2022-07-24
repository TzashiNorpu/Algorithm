#include "Header.h"
using namespace myAlgo;
int longestBeautifulSubstring_1839::longestBeautifulSubstring(string word) {
	int res = 0;
	for (int i=0,j=0; i < word.size(); i++) {
		if (word[i] == 'a') {
			int count = 0;
			for ( j = i + 1; i < word.size()&&word[j]>=word[j-1]; j++) {
				if (word[j] > word[j - 1]) count++;
			}
			if (count == 4) {
				res = max(res, j - i);
			}
			i = j - 1;
		}
	}
	return res;
}