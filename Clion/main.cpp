#include <iostream>
#include "ZeroTrac/1600_1800/header.h"

int main()
{
  ZeroTrac::Solution ins;
  vector<int> times = {1, 1, 1, 1, 1};
  int trips = 10;
  ins.minimumTime(times, trips);
  printf("Hello\n");
  return 0;
}
