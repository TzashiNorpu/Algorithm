//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::countHighestScoreNodes(vector<int> &parents) {
  int count = parents.size();
  function<vector<vector<int>>(vector<int> &)> build_tree = [&](vector<int> &p) -> vector<vector<int>> {
      // 表节点 x 的左子节点为 tree[x][0]，节点 x 的右子节点为 tree[x][1]
      // 若 tree[x][0] 或 tree[x][1] 等于 -1 则代表空指针
      vector<vector<int>> tree(count, vector<int>(2, -1));
      for (int i = 1; i < count; ++i) {
        int parent_i = p[i];
        if (tree[parent_i][0] == -1) tree[parent_i][0] = i;
        else tree[parent_i][1] = i;
      }
      return tree;
  };
  vector<vector<int>> tree = build_tree(parents);


  unordered_map<long, int> score_map;
  long max_score = 0;
  function<int(int)> count_node = [&](int node) -> int {
      if (node == -1) return 0;
      int l = count_node(tree[node][0]);
      int r = count_node(tree[node][1]);
      long score = max(l, 1) * max(r, 1) * max(count - l - r - 1, 1);
      score_map[score]++;
      max_score = max(max_score, score);
      return l + r + 1;
  };

  count_node(0);
  return score_map[max_score];
}