//
// Created by TzashiNorpu on 9/15/2022.
//
#include "../header/binary.h"

using namespace BinarySearch;

int guess(int num) {

}

int Solution::guessNumber(int n) {
  int l = 1, r = n;
  while (l <= r) {
    int mid = l + (r - l) / 2;
    int x = guess(mid);
    if (x == 0) return mid;
    if (x == 1) l = mid + 1;
    else r = mid - 1;
  }
  return 0;
}