//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

int numRescueBoats_881::numRescueBoats(vector<int> &people, int limit) {
    /*
     * 考虑体重最轻的人：
        若他不能与体重最重的人同乘一艘船，那么体重最重的人无法与任何人同乘一艘船，此时应单独分配一艘船给体重最重的人。
        从 people 中去掉体重最重的人后，我们缩小了问题的规模，变成求解剩余 n-1 个人所需的最小船数，将其加一即为原问题的答案。

        若他能与体重最重的人同乘一艘船，那么他能与其余任何人同乘一艘船，为了尽可能地利用船的承载重量，选择与体重最重的人同乘一艘船是最优的。
        从 people 中去掉体重最轻和体重最重的人后，我们缩小了问题的规模，变成求解剩余 n−2 个人所需的最小船数，将其加一即为原问题的答案。
     */
    int ans = 0;
    std::sort(people.begin(), people.end());
    int l = 0, r = people.size() - 1;
    while (l <= r) {
        if (people[l] + people[r] > limit) {
            r--;
        } else {
            l++;
            r--;
        }
        ans++;
    }
    return ans;
}
