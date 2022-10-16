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
    class Graph
    {
    private:
        bool cycled = false;
        int num = 0;
        vector<vector<int>> g;
        vector<bool> on_path;
        vector<bool> visited;
        void traverse(vector<vector<int>> &g, int s)
        {
            if (on_path[s])
                this->cycled = true;
            if (visited[s] || this->cycled)
                return;
            visited[s] = true;
            on_path[s] = true;
            for (auto v : g[s])
                traverse(g, v);
            on_path[s] = false;
        };

    public:
        bool get_cycled()
        {
            for (int i = 0; i < this->num; i++)
                traverse(g, i);
            return this->cycled;
        }
        vector<vector<int>> *build_graph(int num, vector<vector<int>> &dependency)
        {
            this->num = num;
            g = *new vector(num, vector<int>());
            on_path = *new vector(num, false);
            visited = *new vector(num, false);
            for (auto &d : dependency)
                g[d[1]].push_back(d[0]);
            return &g;
        };
    };
    class Solution
    {
    public:
        vector<vector<int>> allPathsSourceTarget(vector<vector<int>> &graph);
        Node *cloneGraph(Node *node);
        int numIslands(vector<vector<char>> &grid);
        int countHighestScoreNodes(vector<int> &parents);
        bool canFinish(int numCourses, vector<vector<int>> &prerequisites);
        vector<int> findOrder(int numCourses, vector<vector<int>> &prerequisites);
    };

}
#endif // CLION_DISJOINT_SET_H
