//
// Created by TzashiNorpu on 7/14/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool canReorderDoubled_954::canReorderDoubled(vector<int> &arr) {
    // [2,1,2,1,1,1,2,2]
    // [1,2,4,0,0,8]
    unordered_map<int, int> map;
    std::sort(arr.begin(), arr.end());
    for (int num: arr) {
        map[num]++;
        if (num == 0) continue;
        // 负数不适用
        if (num > 0 && map.count(num) != 0 && num % 2 == 0 && map.count(num / 2) != 0) {
            map[num]--;
            map[num / 2]--;
            if (map.at(num) == 0) map.erase(num);
            if (map.at(num / 2) == 0) map.erase(num / 2);
        }
        if (num < 0 && map.count(num) != 0 && map.count(num * 2) != 0) {
            map[num]--;
            map[num * 2]--;
            if (map.at(num) == 0) map.erase(num);
            if (map.at(num * 2) == 0) map.erase(num * 2);
        }
    }
    if (map.count(0) != 0 && map.at(0) % 2 == 0)
        map.erase(0);

    return map.empty();
}
