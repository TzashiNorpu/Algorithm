#include <iostream>
#include "ZeroTrac/1600_1800/header.h"


int main() {
  ZeroTrac::Solution ins;
  vector<string> arr1 = {"amazon", "apple", "facebook", "google", "leetcode"};
  vector<string> arr2 = {"e", "o"};
  ins.wordSubsets(arr1, arr2);
  return 0;
}
