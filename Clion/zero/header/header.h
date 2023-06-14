//
// Created by TzashiNorpu on 5/31/2023.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H
using namespace std;

#include "string"
#include "algorithm"
#include "unordered_set"
#include "unordered_map"
#include "numeric"
#include "deque"
#include "regex"
#include "queue"

namespace zero {
    class CustomFunction {
    public:
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        int f(int x, int y);
    };

    struct ListNode {
        int val;
        ListNode *next;

        ListNode() : val(0), next(nullptr) {}

        ListNode(int x) : val(x), next(nullptr) {}

        ListNode(int x, ListNode *next) : val(x), next(next) {}
    };

    struct TreeNode {
        int val;
        TreeNode *left;
        TreeNode *right;

        TreeNode() : val(0), left(nullptr), right(nullptr) {}

        TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

        TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
    };

    class Solution {
    public:
        string reversePrefix(string word, char ch);

        int countOperations(int num1, int num2);

        int dayOfYear(string date);

        int numUniqueEmails(vector<string> &emails);

        long long waysToBuyPensPencils(int total, int cost1, int cost2);

        int longestStrChain(vector<string> &words);

        int countSeniors(vector<string> &details);

        vector<vector<int>> minimumAbsDifference(vector<int> &arr);

        vector<int> sumEvenAfterQueries(vector<int> &nums, vector<vector<int>> &queries);

        int maximumCount(vector<int> &nums);

        bool uniqueOccurrences(vector<int> &arr);

        int maximum69Number(int num);

        bool kLengthApart(vector<int> &nums, int k);

        string gcdOfStrings(string str1, string str2);

        int rotatedDigits(int n);

        int numSteps(string s);

        bool checkXMatrix(vector<vector<int>> &grid);

        double average(vector<int> &salary);

        int findJudge(int n, vector<vector<int>> &trust);

        bool checkString(string s);

        int countElements(vector<int> &nums);

        int arithmeticTriplets(vector<int> &nums, int diff);

        int numberOfMatches(int n);

        bool isThree(int n);

        bool checkZeroOnes(string s);

        int countCharacters(vector<string> &words, string chars);

        vector<int> leftRightDifference(vector<int> &nums);

        int rangeSum(vector<int> &nums, int n, int left, int right);

        int countStudents(vector<int> &students, vector<int> &sandwiches);

        vector<vector<int>> findSolution(CustomFunction &customfunction, int z);

        int pseudoPalindromicPaths(TreeNode *root);

        string entityParser(string text);

        int maxCoins(vector<int> &piles);

        string oddString(vector<string> &words);

        bool findRotation(vector<vector<int>> &mat, vector<vector<int>> &target);

        TreeNode *removeLeafNodes(TreeNode *root, int target);

        int minCostToMoveChips(vector<int> &position);

        int clumsy(int n);

        long long getDescentPeriods(vector<int> &prices);

        int sumOddLengthSubarrays(vector<int> &arr);

        string alphabetBoardPath(string target);

        bool canVisitAllRooms(vector<vector<int>> &rooms);

        int findTheWinner(int n, int k);

        int distinctPrimeFactors(vector<int> &nums);

        int minNumberOfHours(int initialEnergy, int initialExperience, vector<int> &energy, vector<int> &experience);

        string kthLargestNumber(vector<string> &nums, int k);

        vector<string> findAndReplacePattern(vector<string> &words, string pattern);

        int partitionArray(vector<int> &nums, int k);

        vector<int> decrypt(vector<int> &code, int k);

        int minMoves(int target, int maxDoubles);

        int maxSatisfied(vector<int> &customers, vector<int> &grumpy, int minutes);

        int minStoneSum(vector<int> &piles, int k);

        int edgeScore(vector<int> &edges);

        vector<int> numMovesStones(int a, int b, int c);

        int daysBetweenDates(string date1, string date2);

        vector<vector<int>> spiralMatrix(int m, int n, ListNode *head);

        vector<bool> checkArithmeticSubarrays(vector<int> &nums, vector<int> &l, vector<int> &r);

        int maximumCostSubstring(string s, string chars, vector<int> &vals);

        int longestSubarray(vector<int> &nums);

        int longestOnes(vector<int> &nums, int k);

        int numberOfSubarrays(vector<int> &nums, int k);

        int balancedString(string s);

        int numSubarraysWithSum(vector<int> &nums, int goal);

        int subarraysWithKDistinct(vector<int> &nums, int k);

        int totalFruit(vector<int>& fruits);

        int minSubArrayLen(int target, vector<int>& nums);

        int shortestSubarray(vector<int>& nums, int k);
    };

    class OrderedStream {
    private:
        vector<string> stream;
        int ptr;
    public:
        OrderedStream(int n);

        vector<string> insert(int idKey, string value);
    };
}

#endif //CLION_HEADER_H
