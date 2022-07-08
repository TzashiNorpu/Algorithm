#include <iostream>
#include "ZeroTrac/1500_1600/header.h"

int main() {
    ZeroTrac::GetMaximumXor ins;
    vector<int> nums = {0, 1, 2, 2, 5, 7};
    vector<int> res = ins.getMaximumXor(nums, 3);
    return 0;
}
