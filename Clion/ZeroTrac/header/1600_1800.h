//
// Created by TzashiNorpu on 7/25/2022.
//

#ifndef CLION_1600_1800_H
#define CLION_1600_1800_H

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
#include "climits"

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

        int numberOfSubarrays_1248(vector<int> &nums, int k);

        int numberOfSubarraysWithK(vector<int> &nums, int k);

        int subarraysWithKDistinct_992(vector<int> &nums, int k);

        vector<string> wordSubsets(vector<string> &words1, vector<string> &words2);

        bool isBipartite(vector<vector<int>> &graph);

        string rankTeams(vector<string> &votes);

        int removePalindromeSub(string s);

        int concatenatedBinary(int n);

        bool canConvertString(string s, string t, int k);

        int minimumLengthEncoding(vector<string> &words);

        int makeConnected(int n, vector<vector<int>> &connections);

        vector<int> prevPermOpt1(vector<int> &arr);

        int minReorder(int n, vector<vector<int>> &connections);

        bool mergeTriplets(vector<vector<int>> &triplets, vector<int> &target);

        int maxNumberOfFamilies(int n, vector<vector<int>> &reservedSeats);

        int minOperations(vector<int> &nums);

        bool equationsPossible(vector<string> &equations);

        string pushDominoes(string dominoes);

        int nearestExit(vector<vector<char>> &maze, vector<int> &entrance);

        int minOperations(vector<int> &nums, vector<int> &numsDivide);

        long long minimumTime(vector<int> &time, int totalTrips);

        int largestCombination(vector<int> &candidates);

        int maxConsecutiveAnswers(string answerKey, int k);

        TreeNode *createBinaryTree(vector<vector<int>> &descriptions);

        int maximumCandies(vector<int> &candies, long long k);

        int numberOfSubstrings(string s);

        long long maxMatrixSum(vector<vector<int>> &matrix);

        vector<int> advantageCount(vector<int> &nums1, vector<int> &nums2);

        bool isSubPath(ListNode *head, TreeNode *root);

        vector<int> smallestTrimmedNumbers(vector<string> &nums, vector<vector<int>> &queries);

        vector<string>
        watchedVideosByFriends(vector<vector<string>> &watchedVideos, vector<vector<int>> &friends, int id, int level);

        int minDifference(vector<int> &nums);

        int numRollsToTarget(int n, int k, int target);

        int longestOnes(vector<int> &nums, int k);

        long long numberOfWays(string s);

        string minRemoveToMakeValid(string s);

        int unhappyFriends(int n, vector<vector<int>> &preferences, vector<vector<int>> &pairs);

        int shortestPathBinaryMatrix(vector<vector<int>> &grid);

        bool hasValidPath(vector<vector<int>> &grid);

        int numFriendRequests(vector<int> &ages);

        vector<string> getFolderNames(vector<string> &names);

        ListNode *reverseEvenLengthGroups(ListNode *head);

        vector<vector<int>> spiralMatrixIII(int rows, int cols, int rStart, int cStart);

        int carFleet(int target, vector<int> &position, vector<int> &speed);

        int subarraysDivByK(vector<int> &nums, int k);

        vector<vector<int>> verticalTraversal(TreeNode *root);

        int minSpeedOnTime(vector<int> &dist, double hour);

        int countGoodNumbers(long long n);

        int maxProduct(TreeNode *root);

        vector<int> maxSlidingWindow(vector<int> &nums, int k);

        int constrainedSubsetSum(vector<int> &nums, int k);

        int kthLargestValue(vector<vector<int>> &matrix, int k);

        int maxDistance(vector<vector<int>> &grid);

        vector<int> bestCoordinate(vector<vector<int>> &towers, int radius);

        long long countVowels(string word);

        int getMaximumGold(vector<vector<int>> &grid);

        vector<int> distanceK(TreeNode *root, TreeNode *target, int k);

        int minimumOperations(vector<int> &nums);

        long long minimalKSum(vector<int> &nums, int k);

        int closedIsland(vector<vector<int>> &grid);

        vector<string> invalidTransactions(vector<string> &transactions);

        bool checkMove(vector<vector<char>> &board, int rMove, int cMove, char color);

        int minPathCost(vector<vector<int>> &grid, vector<vector<int>> &moveCost);
    };

    class FrontMiddleBackQueue {
    private:
        deque<int> a, b;

        void a2b() {
          if (a.size() > b.size())
            b.push_front(a.back()), a.pop_back();
        }

        void b2a() {
          if (b.size() > a.size() + 1)
            a.push_back(b.front()), b.pop_front();
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
#endif // CLION_1600_1800_H
