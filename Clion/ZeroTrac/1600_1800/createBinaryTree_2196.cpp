//
// Created by TzashiNorpu on 8/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

TreeNode *Solution::createBinaryTree(vector<vector<int>> &descriptions) {
  unordered_map<int, TreeNode *> map;                          //to check if node alredy exist
  unordered_map<int, bool> isChild;                               //to check if node has parent or not
  for (auto &v: descriptions) {
    if (map.count(v[0]) == 0) {
      TreeNode *par = new TreeNode(v[0]);
      map[v[0]] = par;
    }
    if (map.count(v[1]) == 0) {
      TreeNode *child = new TreeNode(v[1]);
      map[v[1]] = child;
    }
    if (v[2] == 1) map[v[0]]->left = map[v[1]];               //left-child
    else map[v[0]]->right = map[v[1]];                     //right-child
    isChild[v[1]] = true;
  }
  TreeNode *ans = NULL;
  for (auto &v: descriptions) {
    if (isChild[v[0]] != true) {                  //if node has no parent then this is root node
      ans = map[v[0]];
      break;
    }
  }
  return ans;
}