#include <iostream>
#include "ZeroTrac/1600_1800/header.h"


int main() {
  ZeroTrac::Solution ins;
  vector<string> arr = {"a==b", "a==c", "b!=a"};
  ins.equationsPossible(arr);

  return 0;
}
