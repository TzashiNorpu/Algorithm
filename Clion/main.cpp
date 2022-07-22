#include <iostream>
#include "ZeroTrac/1500_1600/header.h"


int main() {
    ZeroTrac::canChoose_1764 ins;
    vector<vector<int>> groups = {{21, 22, 21, 22, 21, 30}};
    vector<int> nums = {21, 22, 21, 22, 21, 22, 21, 30};
    ins.canChoose(groups, nums);
    return 0;
}
