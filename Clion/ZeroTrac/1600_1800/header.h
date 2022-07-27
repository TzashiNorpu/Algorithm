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
#include "stack"

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

        int countHousePlacements_2320(int n);

        int maxWidthRamp_962(vector<int> &nums);

        int numOfSubarrays_1524(vector<int> &arr);

        bool escapeGhosts_789(vector<vector<int>> &ghosts, vector<int> &target);
    };

    class FrontMiddleBackQueue {
    private:
        deque<int> a, b;

        void a2b() {
            if (a.size() > b.size()) b.push_front(a.back()), a.pop_back();
        }

        void b2a() {
            if (b.size() > a.size() + 1) a.push_back(b.front()), b.pop_front();
        }

    public:
        FrontMiddleBackQueue();

        void pushFront(int val);

        void pushMiddle(int val);

        void pushBack(int val);

        int popFront();

        int popMiddle();

        int popBack();
    };
}
#endif //CLION_HEADER_H
