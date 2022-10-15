//
// Created by TzashiNorpu on 7/6/2022.
//

#ifndef CLION_1600_1800_H
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

    struct ListNode {
        int val;
        ListNode *next;

        ListNode() : val(0), next(nullptr) {}

        ListNode(int x) : val(x), next(nullptr) {}

        ListNode(int x, ListNode *next) : val(x), next(next) {}
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
    private:
        int res = 0;

        void helper(vector<int> &nums, vector<int> &choose, vector<bool> chooseIdx);

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

    class removeDuplicates_1209 {
    public:
        string removeDuplicatesBy2Pointers(string s, int k);

        string removeDuplicatesByStack(string s, int k);
    };

    class removeDuplicates_1047 {
    public:
        string removeDuplicatesBy2Pointers(string s);

        string removeDuplicatesByStack(string s);
    };

    class maxAbsoluteSum_1749 {
    public:
        int maxAbsoluteSum(vector<int> &nums);
    };

    class intervalIntersection_986 {
    public:
        vector<vector<int>> intervalIntersection(vector<vector<int>> &firstList, vector<vector<int>> &secondList);
    };

    class smallestDivisor_1283 {
    public:
        int smallestDivisor(vector<int> &nums, int threshold);
    };

    class largestTriangleArea_812 {
    public:
        double largestTriangleArea(vector<vector<int>> &points);
    };

    class validTicTacToe_794 {
    public:
        bool validTicTacToe(vector<string> &board);
    };

    class removeSubfolders_1233 {
    public:
        vector<string> removeSubfolders(vector<string> &folder);
    };

    class pathInZigZagTree_1104 {
    public:
        vector<int> pathInZigZagTree(int label);
    };

    class canReorderDoubled_954 {
    public:
        bool canReorderDoubled(vector<int> &arr);
    };

    class minOperationsMaxProfit_1599 {
    public:
        int minOperationsMaxProfit(vector<int> &customers, int boardingCost, int runningCost);
    };

    class diagonalSort_1329 {
    public:
        vector<vector<int>> diagonalSort(vector<vector<int>> &mat);
    };

    class halveArray_2208 {
    public:
        int halveArray(vector<int> &nums);
    };

    class maximumSubsequenceCount_2207 {
    public:
        long long maximumSubsequenceCount(string text, string pattern);
    };

    class longestPalindrome_2131 {
    public:
        int longestPalindrome(vector<string> &words);
    };

    class findOriginalArray_2007 {
    public:
        vector<int> findOriginalArray(vector<int> &changed);
    };

    class movesToMakeZigzag_1144 {
    public:
        int movesToMakeZigzag(vector<int> &nums);
    };

    class minimumNumbers_2310 {
    public:
        int minimumNumbers(int num, int k);
    };

    class numOfMinutes_1376 {
    public:
        int numOfMinutes(int n, int headID, vector<int> &manager, vector<int> &informTime);
    };

    class scoreOfParentheses_856 {
    public:
        int scoreOfParentheses(string s);
    };

    class peopleIndexes_1452 {
    public:
        vector<int> peopleIndexes(vector<vector<string>> &favoriteCompanies);
    };

    class bstFromPreorder_1008 {
    public:
        TreeNode *bstFromPreorder(vector<int> &preorder);
    };

    class nextLargerNodes_1019 {
    public:
        vector<int> nextLargerNodes(ListNode *head);
    };

    class isNStraightHand_846 {
    public:
        bool isNStraightHand(vector<int> &hand, int groupSize);
    };

    class maxChunksToSorted_769 {
    public:
        int maxChunksToSorted(vector<int> &arr);
    };

    class countMaxOrSubsets_2044 {
    private:
        int res = 0;

        void helper(int m, int n, int index, vector<int> &nums);

    public:
        int countMaxOrSubsets(vector<int> &nums);
    };

    class corpFlightBookings_1109 {
    public:
        vector<int> corpFlightBookings(vector<vector<int>> &bookings, int n);
    };

    class kthGrammar_779 {
    public:
        int kthGrammar(int n, int k);
    };

    class minFallingPathSum_931 {
    private:
        int res = 2000000;

        void helper(int colIndex, int rowIndex, int sum, vector<vector<int>> &matrix);

    public:
        int minFallingPathSum(vector<vector<int>> &matrix);
    };

    class suggestedProducts_1268 {
    public:
        vector<vector<string>> suggestedProducts(vector<string> &products, string searchWord);
    };

    class minCost_1578 {
    public:
        int minCost(string colors, vector<int> &neededTime);
    };

    class maxScore_1423 {
    public:
        int maxScore(vector<int> &cardPoints, int k);
    };

    class TimeMap_981 {
    private:
        unordered_map<string, map<int, string>> m;

    public:
        TimeMap_981();

        void set(string key, string value, int timestamp);

        string get(string key, int timestamp);
    };

    class getHappyString_1415 {
    public:
        string getHappyString(int n, int k);
    };

    class discountPrices_2288 {
    public:
        string discountPrices(string sentence, int discount);
    };

    class colorBorder_1034 {
    public:
        vector<vector<int>> colorBorder(vector<vector<int>> &grid, int row, int col, int color);
    };

    class restoreArray_1743 {
    public:
        vector<int> restoreArray(vector<vector<int>> &adjacentPairs);
    };

    class countCollisions_2211 {
    public:
        int countCollisions(string directions);
    };

    class allCellsDistOrder_1030 {
    public:
        vector<vector<int>> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter);
    };

    class areSentencesSimilar_1813 {
    public:
        bool areSentencesSimilar(string sentence1, string sentence2);
    };

    class canChoose_1764 {
    public:
        bool canChoose(vector<vector<int>> &groups, vector<int> &nums);
    };

    class stoneGame_877 {
    public:
        bool stoneGame(vector<int> &piles);
    };

    class numSpecialEquivGroups_893 {
    public:
        int numSpecialEquivGroups(vector<string> &words);
    };

    class waysToMakeFair_1664 {
    public:
        int waysToMakeFair(vector<int> &nums);
    };

    class pancakeSort_969 {
    public:
        vector<int> pancakeSort(vector<int> &arr);
    };

    class CombinationIterator_1286 {
    private:
        int curr;
        int sz;
        int maxCnt;
        string key;
    public:
        CombinationIterator_1286(string characters, int combinationLength);

        string next();

        bool hasNext();
    };

    class numSubarraysWithSum_930 {
    public:
        int numSubarraysWithSum(vector<int> &nums, int goal);
    };

    class numTriplets_1577 {
    public:
        int numTriplets(vector<int> &nums1, vector<int> &nums2);
    };

    class flipgame_822 {
    public:
        int flipgame(vector<int> &fronts, vector<int> &backs);
    };

    class minimumSwap_1247 {
    public:
        int minimumSwap(string s1, string s2);
    };

    class longestSubsequence_1218 {
    public:
        int longestSubsequence(vector<int> &arr, int difference);
    };

    class longestStrChain_1048 {
    public:
        int longestStrChain(vector<string> &words);
    };
}


#endif //CLION_1600_1800_H
