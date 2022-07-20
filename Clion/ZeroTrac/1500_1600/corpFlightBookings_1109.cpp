//
// Created by TzashiNorpu on 7/20/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> corpFlightBookings_1109::corpFlightBookings(vector<vector<int>> &bookings, int n) {
    vector<int> res(n, 0);
    for (auto booking: bookings) {
        int b = booking[0] - 1;
        int e = booking[1] - 1;
        int v = booking[2];
        res[b] += v;
        if (e + 1 < n) res[e + 1] -= v;
    }
    for (int i = 1; i < n; ++i) {
        res[i] += res[i - 1];
    }
    return res;
}