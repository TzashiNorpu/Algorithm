#include <iostream>
#include "ZeroTrac/1500_1600/header.h"


int main() {
    ZeroTrac::minDominoRotations_1007 ins;
    vector<int> tops = {2, 1, 2, 4, 2, 2};
    vector<int> bottoms = {5, 2, 6, 2, 3, 2};
    ins.minDominoRotations(tops, bottoms);
    return 0;
}
