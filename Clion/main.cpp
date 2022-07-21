#include <iostream>
#include "ZeroTrac/1500_1600/header.h"


int main() {
    ZeroTrac::restoreArray_1743 ins;
    vector<vector<int>> pairs = {{2, 1},
                                 {3, 4},
                                 {3, 2}};
    ins.restoreArray(pairs);
    return 0;
}
