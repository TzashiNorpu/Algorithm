//
// Created by TzashiNorpu on 10/14/2022.
//

#ifndef CLION_DISJOINT_SET_H
#define CLION_DISJOINT_SET_H

#include "vector"
#include "stdio.h"
#include "string"
#include "functional"
#include "unordered_set"
using namespace std;
namespace G
{
    class Solution
    {
    public:
        vector<vector<int>> allPathsSourceTarget(vector<vector<int>> &graph);
        Node *cloneGraph(Node *node);
    };
    class Node
    {
    public:
        int val;
        vector<Node *> neighbors;
        Node()
        {
            val = 0;
            neighbors = vector<Node *>();
        }
        Node(int _val)
        {
            val = _val;
            neighbors = vector<Node *>();
        }
        Node(int _val, vector<Node *> _neighbors)
        {
            val = _val;
            neighbors = _neighbors;
        }
    };
}
#endif // CLION_DISJOINT_SET_H
