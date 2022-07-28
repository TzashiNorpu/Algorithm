#include <iostream>
#include "ZeroTrac/1600_1800/header.h"


int main() {
    ZeroTrac::Solution ins;
    vector<int> left = {4, 3};
    vector<int> right = {0, 1};
    int res = ins.getLastMoment_1503(4, left, right);
    printf("res=%d", res);
    return 0;

}
