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

        string minimizeResult_2232(string expression);

        int countSquares_1277(vector<vector<int>> &matrix);

        int numberOfArrays_2145(vector<int> &differences, int lower, int upper);

        int numEnclaves_1020(vector<vector<int>> &grid);

        int getLastMoment_1503(int n, vector<int> &left, vector<int> &right);

        int minimumBuckets_2086(string street);
        
        int numberOfSubarrays_1248(vector<int>& nums, int k) ;

        int subarraysWithKDistinct_992(vector<int>& nums, int k);
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

    class ATM {
    private:
        long long bank[5] = {}, val[5] = {20, 50, 100, 200, 500};
    public:
        ATM();

        void deposit(vector<int> banknotesCount);

        vector<int> withdraw(int amount);
    };
}
#endif //CLION_HEADER_H
