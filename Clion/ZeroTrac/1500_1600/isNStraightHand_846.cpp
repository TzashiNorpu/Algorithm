//
// Created by TzashiNorpu on 7/19/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool isNStraightHand_846::isNStraightHand(vector<int> &hand, int groupSize) {
    map<int, int> m;
    for (int h: hand) m[h]++;
    for (auto kv: m) {
        if (m[kv.first] > 0) {
            for (int i = groupSize - 1; i >= 0; i--)
                if ((m[kv.first + i] -= m[kv.first]) < 0) return false;
        }
    }
    return true;
}
