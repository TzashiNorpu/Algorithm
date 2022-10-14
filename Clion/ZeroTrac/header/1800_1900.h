//
// Created by TzashiNorpu on 10/13/2022.
//


#ifndef CLION_1800_1900_H
#define CLION_1800_1900_H

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
#include "functional"
#include "stack"
#include <cstring>

using namespace std;
namespace ZeroTrac {
    class Solution {
    public:
        int numFactoredBinaryTrees(vector<int> &arr);

        vector<int> getBiggestThree(vector<vector<int>> &grid);

        bool reachingPoints(int sx, int sy, int tx, int ty);

        int longestCycle(vector<int> &edges);

        int nthMagicalNumber(int n, int a, int b);

        bool canReach(string s, int minJump, int maxJump);

        int peopleAwareOfSecret(int n, int delay, int forget);

        int minimumHammingDistance(vector<int> &source, vector<int> &target, vector<vector<int>> &allowedSwaps);

        string smallestStringWithSwaps(string s, vector<vector<int>> &pairs);

    };
}

#endif //CLION_1800_1900_H
