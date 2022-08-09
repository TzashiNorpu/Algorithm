#include <iostream>
#include "ZeroTrac/1600_1800/header.h"


int main() {
    ZeroTrac::Solution ins;
    vector<int> arr = {1,2,3,1};
    int k=2;
    int res = ins.subarraysWithKDistinct_992(arr,k);
    printf("res=%d", res);
    return 0;
}
