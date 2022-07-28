//
// Created by TzashiNorpu on 7/28/2022.
//
#include "header.h"

using namespace ZeroTrac;

void ZeroTrac::ATM::deposit(vector<int> banknotesCount) {
    for (int i = 0; i < 5; ++i)
        bank[i] += banknotesCount[i];
}

vector<int> ZeroTrac::ATM::withdraw(int amount) {
    vector<int> take(5);
    for (int i = 4; i >= 0; --i) {
        take[i] = min(bank[i], amount / val[i]);
        amount -= take[i] * val[i];
    }
    if (amount)
        return {-1};
    for (int i = 0; i < 5; ++i)
        bank[i] -= take[i];
    return take;
}