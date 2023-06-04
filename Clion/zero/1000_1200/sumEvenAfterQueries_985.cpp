//
// Created by tseringnorpu on 6/4/2023.
//
#include "../header/header.h"
using namespace zero;

vector<int> Solution::sumEvenAfterQueries(vector<int> &nums, vector <vector<int>> &queries) {
    int sum=0;
    vector<int> res;
    for (auto num: nums) {
        if (num%2==0) sum += num;
    }
    for (auto query: queries) {
        int index = query[1];
        if ((nums[index]+query[0])%2==0){
            if (nums[index]%2==0)
                sum += query[0];
            else
                sum += (query[0] + nums[index]);
        } else if (nums[index] % 2 == 0) {
            sum -= nums[index];
        }
        nums[index] += query[0];
        res.push_back(sum);
    }
    return res;
}