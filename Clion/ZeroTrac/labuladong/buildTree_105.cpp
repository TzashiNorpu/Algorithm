//
// Created by TzashiNorpu on 3/14/2023.
//
#include "tree_r1.h"

using namespace Tree;

TreeNode *Solution::buildTree_105(vector<int> &preorder, vector<int> &inorder) {
  /*int rootIdx = 0;
  unordered_map<int, int> map;
  for (int i = 0; i < inorder.size(); i++) {
    map[inorder[i]] = i;
    //value -> index mapping for inorder array
  }
  //***Note*** that rootIdx is passed as reference
  function<TreeNode *(int &, int, int)> build =
          [&](int &rootIdx, int left, int right) -> TreeNode * {
              // 当前区间无效
              if (left > right) return nullptr;
              *//*int pivot = left;
              while (inorder[pivot] != preorder[rootIdx]) pivot++;*//*
              int pivot = map[preorder[rootIdx]];
              TreeNode *node = new TreeNode(preorder[rootIdx]);
              // 为所有的节点都生成左右子树
              rootIdx++;
              //rootIdx value gets changed after successive calls to build the left subtree
              //Since it is passed as reference, updated value of rootIdx is passed to build the right subtree
              node->left = build(rootIdx, left, pivot - 1);
              node->right = build(rootIdx, pivot + 1, right);
              return node;
          };
  return build(rootIdx, 0, inorder.size() - 1);*/
  /*if (preorder.size() == 0 || inorder.size() == 0) return nullptr;
  TreeNode *node = new TreeNode(preorder[0]);
  int pivot = 0;
  while (inorder[pivot] != preorder[0]) pivot++;
  preorder.assign(preorder.begin() + 1, preorder.end());
  vector<int> inorder_l(inorder.begin(), inorder.begin() + pivot);
  vector<int> inorder_r(inorder.begin() + pivot + 1, inorder.end());
  node->left = buildTree_105(preorder, inorder_l);
  node->right = buildTree_105(preorder, inorder_r);
  return node;*/


  int n = inorder.size() - 1;
  function<TreeNode *(int, int, int)> build = [&](int nodeIdx, int in_start, int in_end) -> TreeNode * {
      if (in_start > in_end) return nullptr;
      TreeNode *node = new TreeNode(preorder[nodeIdx]);
      int pivot = std::find(inorder.begin(), inorder.end(), preorder[nodeIdx]) - inorder.begin();
      // nodeIdx + 1:node 的左节点位置
      // nodeIdx + (pivot - in_start) + 1:node 的右节点位置
      node->left = build(nodeIdx + 1, in_start, pivot - 1);
      node->right = build(nodeIdx + (pivot - in_start) + 1, pivot + 1, in_end);
      return node;
  };
  return build(0, 0, n);
}