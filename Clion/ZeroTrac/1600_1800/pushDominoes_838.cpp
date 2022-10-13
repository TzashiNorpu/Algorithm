//
// Created by TzashiNorpu on 8/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

string Solution::pushDominoes(string dominoes) {
  /*
	In this approach, you just need to find sections like this
	X .   .   .   . X
	i               j
	Where X can be 'R' or 'L' and in between there can be as many dots
	Now,
	- you know the length of mid part
	- If char[i] == char[j] == 'R', means all go towards right (R)
	-  char[i]  == char[j] == 'L', means all go towards Left (L)
	-  If char[i] = 'L' and char[j] = 'R', means middle part is not affected so they remain '.'
	-  If char[i] = 'R' and char[j] = 'L', then it will affect the middle part.
	   The middle_part/2 close to i will be affected by 'R' and middle_part/2 close to j will be
	   effected by 'L'  and the last mid point (middle_part%2) will be unaffected due to equal
	   force from left and right so it remains '.'
  */
  string res = "";
  dominoes = 'L' + dominoes + 'R';
  for (int i = 0, j = 1; j < dominoes.length(); j++) {
    if (dominoes[j] == '.') continue;
    // 当前推倒的位置
    if (i > 0) res += dominoes[i];
    // 两个推倒位置中间的位置
    int len = j - i - 1;
    if (dominoes[i] == dominoes[j]) res += string(len, dominoes[i]);
    else if (dominoes[i] == 'L' && dominoes[j] == 'R') res += string(len, '.');
    else res += string(len / 2, 'R') + string(len % 2, '.') + string(len / 2, 'L');
    i = j;
  }
  return res;
}