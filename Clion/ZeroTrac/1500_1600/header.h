//
// Created by TzashiNorpu on 7/6/2022.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H

#include "vector"
#include <cmath>
#include "set"
#include "string"
#include "unordered_map"
#include "map"
#include "algorithm"

using namespace std;
namespace ZeroTrac {
    class CountVowelStrings {
    public:
        int countVowelStrings(int n);
    };

    class CheckPowersOfThree {
    public:
        bool checkPowersOfThree(int n);


    private:
        bool helper(int sum, int n, int chooseIdx, vector<int> nums);
    };

    class LongestNiceSubstring {
    public:
        string longestNiceSubstring(string s);

    };

    class MaximalNetworkRank {
    public:
        int maximalNetworkRank(int n, vector<vector<int>> &roads);
    };

    class GetMaximumXor {
    public:
        vector<int> getMaximumXor(vector<int> &nums, int maximumBit);
    };

    class CanFormArray {
    public:
        bool canFormArray(vector<int> &arr, vector<vector<int>> &pieces);
    };

    class CountTriplets {
    public:
        int countTriplets(vector<int> &arr);

        bool xorSum(int i, int j, vector<int> &vector);
    };

    class DigArtifacts {
    public:
        int digArtifacts(int n, vector<vector<int>> &artifacts, vector<vector<int>> &dig);
    };

    class EliminateMaximum {
    public:
        int eliminateMaximum(vector<int> &dist, vector<int> &speed);
    };

}


#endif //CLION_HEADER_H
