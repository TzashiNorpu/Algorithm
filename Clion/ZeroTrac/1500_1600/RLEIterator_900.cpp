//
// Created by TzashiNorpu on 7/11/2022.
//

#include "header.h"

using namespace ZeroTrac;

RLEIterator_900::RLEIterator_900(vector<int> &encoding) {
    this->enc = encoding;
}

int RLEIterator_900::next(int n) {
    int pos = 0;
    int sum = 0;
    while (pos < this->enc.size() && sum + enc[pos] < n) {
        sum += enc[pos];
        enc[pos] = 0;
        pos += 2;
    }
    if (pos >= this->enc.size()) return -1;
    this->enc[pos] -= (n - sum);
    return this->enc[pos + 1];
}
