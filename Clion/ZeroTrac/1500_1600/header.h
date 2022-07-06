//
// Created by TzashiNorpu on 7/6/2022.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H
#include "vector"
#include <cmath>
using namespace std;
namespace ZeroTrac{
    class Solution{
    public:
        bool checkPowersOfThree(int n);
    private:
        bool helper(int sum, int n, int chooseIdx, vector<int> nums);
    };
}


#endif //CLION_HEADER_H
