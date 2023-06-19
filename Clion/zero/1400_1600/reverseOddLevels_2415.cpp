//
// Created by TzashiNorpu on 2023/6/19.
//
#include "../header/header.h"

using namespace zero;

TreeNode *Solution::reverseOddLevels(TreeNode *root) {
  deque < TreeNode * > fir;
  deque < TreeNode * > sec;
  deque < TreeNode * > thir;
  deque < TreeNode * > tmp;
  fir.push_back(root);
  while (!fir.empty()) {
    for (auto x: fir) {
      if (x->left)
        sec.push_back(x->left);
      if (x->right)
        sec.push_back(x->right);
    }
    for (auto x: sec) {
      if (x->left)
        thir.push_back(x->left);
      if (x->right)
        thir.push_back(x->right);
    }

    while (!fir.empty()) {
      auto x1 = fir.front();
      fir.pop_front();
      if (!sec.empty()) {
        auto l1 = sec.back();
        sec.pop_back();
        auto r1 = sec.back();
        sec.pop_back();
        x1->left = l1;
        x1->right = r1;
        if (!thir.empty()) {
          auto l11 = thir.front();
          thir.pop_front();
          tmp.push_back(l11);
          auto r11 = thir.front();
          thir.pop_front();
          tmp.push_back(r11);
          l1->left = l11;
          l1->right = r11;
          auto l21 = thir.front();
          thir.pop_front();
          tmp.push_back(l21);
          auto r21 = thir.front();
          thir.pop_front();
          tmp.push_back(r21);
          r1->left = l21;
          r1->right = r21;
        }
      }
    }
    if (!tmp.empty())
      fir = tmp, tmp.clear();
  }
  return root;
}