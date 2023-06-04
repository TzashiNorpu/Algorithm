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

namespace zero {
    class Solution {
    public:
        string reversePrefix(string word, char ch);

        int countOperations(int num1, int num2);

        int dayOfYear(string date);

        int numUniqueEmails(vector<string> &emails);

        long long waysToBuyPensPencils(int total, int cost1, int cost2);

        int longestStrChain(vector<string> &words);

        int countSeniors(vector<string>& details);

        vector<vector<int>> minimumAbsDifference(vector<int>& arr);

        vector<int> sumEvenAfterQueries(vector<int>& nums, vector<vector<int>>& queries);

        int maximumCount(vector<int>& nums);

        bool uniqueOccurrences(vector<int>& arr);
        int maximum69Number (int num);

        bool kLengthApart(vector<int>& nums, int k);
    };
}

#endif //CLION_HEADER_H
