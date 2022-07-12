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
#include "unordered_set"
#include "map"
#include "algorithm"

using namespace std;
namespace ZeroTrac {
    struct TreeNode {
        int val;
        TreeNode *left;
        TreeNode *right;

        TreeNode() : val(0), left(nullptr), right(nullptr) {}

        TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

        TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
    };

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

    class MaximumUniqueSubarray_1695 {
    public:
        int maximumUniqueSubarray(vector<int> &nums);
    };

    class numRescueBoats_881 {
    public:
        int numRescueBoats(vector<int> &people, int limit);
    };

    class tupleSameProduct_1726 {
    public:
        int tupleSameProduct(vector<int> &nums);
    };

    class closeStrings_1657 {
    public:
        bool closeStrings(string word1, string word2);
    };

    class canConstruct_1400 {
    public:
        bool canConstruct(string s, int k);
    };

    class RLEIterator_900 {
    private:
        vector<int> enc;
    public:
        RLEIterator_900(vector<int> &encoding);

        int next(int n);
    };

    class numPairsDivisibleBy60_1010 {
    public:
        int numPairsDivisibleBy60(vector<int> &time);
    };

    class countPalindromicSubsequence_1930 {
    public:
        int countPalindromicSubsequence(string s);

        int countAlphabet(int start_index, int end_index, string basicString);
    };

    class closestDivisors_1362 {
    public:
        vector<int> closestDivisors(int num);
    };

    class subtreeWithAllDeepest_865 {
    public:
        TreeNode *subtreeWithAllDeepest(TreeNode *root);
    };

    class AuthenticationManager_1797 {
    private:
        int ttl;
        unordered_map<string, int> map;
    public:
        AuthenticationManager_1797(int timeToLive);

        void generate(string tokenId, int currentTime);

        void renew(string tokenId, int currentTime);

        int countUnexpiredTokens(int currentTime);
    };

    class rotateTheBox_1861 {
    public:
        vector<vector<char>> rotateTheBox(vector<vector<char>> &box);
    };

    class camelMatch_1023 {
    public:
        vector<bool> camelMatch(vector<string> &queries, string pattern);
    };

    class maximumEvenSplit_2178 {
    public:
        vector<long long> maximumEvenSplit(long long finalSum);
    };

    class findFarmland_1992 {
    public:
        vector<vector<int>> findFarmland(vector<vector<int>> &land);
    };

    class balanceBST_1382 {
    private:
        vector<int> nums;
    public:
        TreeNode *balanceBST(TreeNode *root);

        void inorder(TreeNode *root);

        TreeNode *build(vector<int> inorder, int l, int r);
    };

    class minDominoRotations_1007 {
    public:
        int minDominoRotations(vector<int> &tops, vector<int> &bottoms);
    };


}


#endif //CLION_HEADER_H
