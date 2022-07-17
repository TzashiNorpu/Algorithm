//
// Created by TzashiNorpu on 7/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

int minimumNumbers_2310::minimumNumbers(int num, int k) {
    if(num==0) return 0;
    for(int i=1;i<=10;i++){
        if (k*i%10==num%10 && i*k<=num)
            return i;
    }
    return -1;
}
