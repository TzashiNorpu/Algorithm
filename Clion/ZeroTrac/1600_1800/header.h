//
// Created by TzashiNorpu on 7/25/2022.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H

#include "vector"
#include <cmath>
#include "set"
#include "string"
#include "unordered_map"
#include "unordered_set"
#include "map"
#include "algorithm"
#include "queue"
#include "numeric"
#include "data.h"
#include "functional"

using namespace std;
namespace ZeroTrac {
    class Solution {
    public:
        int minSwaps_1864(string s);

        int minFlipsMonoIncr_926(string s);

        int countLatticePoints_2249(vector<vector<int>> &circles);

        long long countPairs_2316(int n, vector<vector<int>> &edges);

        int expressiveWords_809(string s, vector<string> &words);

        vector<string> alertNames_1604(vector<string> &keyName, vector<string> &keyTime);

        int findBestValue_1300(vector<int> &arr, int target);

        TreeNode *lcaDeepestLeaves_1123(TreeNode *root);
    };
}
#endif //CLION_HEADER_H
