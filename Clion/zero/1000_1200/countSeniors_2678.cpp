//
// Created by tseringnorpu on 6/3/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::countSeniors(vector <string> &details) {
    int res=0;
    for (auto &detail: details) {
        int age = stoi(detail.substr(11, 2));
        //printf("age=%d\n",age);
        if(age>60) res++;
    }
    return res;
}