#include <iostream>
#include "ZeroTrac/1600_1800/header.h"

int main()
{
  ZeroTrac::Solution ins;
  int res = ins.countGoodNumbers(50);
  printf("res=%d\n", res);
  return 0;
}
