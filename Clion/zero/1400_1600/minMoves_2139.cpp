//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::minMoves(int target, int maxDoubles) {
    int moves=0;
    int x = maxDoubles;
    int temp = target;
    while (temp > 1 && x > 0) {
        moves+=temp%2;
        temp /=2;
        x--;
        moves++;
    }
    moves += (temp - 1);
    return moves;
}