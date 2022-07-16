//
// Created by TzashiNorpu on 7/14/2022.
//
#include "header.h"

using namespace ZeroTrac;

int minOperationsMaxProfit_1599::minOperationsMaxProfit(vector<int> &customers, int boardingCost, int runningCost) {
    int wait = 0, prof = 0, max_prof = 0, max_i = -1;
    for (int i = 0; i < customers.size() || wait > 0; ++i) {
        if (i < customers.size())
            wait += customers[i];
        prof += min(4, wait) * boardingCost - runningCost;
        wait -= min(4, wait);
        if (max_prof < prof) {
            max_prof = prof;
            max_i = i + 1;
        }
    }
    return max_i;
}
