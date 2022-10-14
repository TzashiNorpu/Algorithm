//
// Created by TzashiNorpu on 10/14/2022.
//

#ifndef CLION_DISJOINT_SET_H
#define CLION_DISJOINT_SET_H

#include "vector"
#include "stdio.h"
#include "string"

using namespace std;
namespace DS {
    class Solution {
    public:
        void solve(vector<vector<char>> &board);

        bool equationsPossible(vector<string> &equations);

        bool validateBinaryTreeNodes(int n, vector<int> &leftChild, vector<int> &rightChild);
    };

    class UF {
    private:
        int num;
        vector<int> parent;

        // 路径压缩
        int find(int x) {
          if (parent[x] != x)
            parent[x] = find(parent[x]);
          return parent[x];
        }

    public:
        UF(int n) {
          this->num = n;
          for (int i = 0; i < n; ++i)
            this->parent.push_back(i);
        }

        void connect(int p, int q) {
          int rootP = find(p);
          int rootQ = find(q);
          if (rootP == rootQ) return;
          parent[rootP] = rootQ;
          this->num--;
        }

        bool connected(int p, int q) {
          int rootP = find(p);
          int rootQ = find(q);
          return rootQ == rootP;
        }

        int count() {
          return num;
        }
    };
}
#endif //CLION_DISJOINT_SET_H
