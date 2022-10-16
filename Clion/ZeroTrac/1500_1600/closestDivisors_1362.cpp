//
// Created by TzashiNorpu on 7/12/2022.
//

#include "../header/1500_1600.h"

using namespace ZeroTrac;

vector<int> closestDivisors_1362::closestDivisors(int x) {
  for (int a = sqrt(x + 2); a > 0; --a) {
    if ((x + 1) % a == 0)
      return {a, (x + 1) / a};
    if ((x + 2) % a == 0)
      return {a, (x + 2) / a};
  }
  return {};
}
