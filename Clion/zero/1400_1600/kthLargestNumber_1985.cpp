//
// Created by TzashiNorpu on 2023/6/9.
//
#include "../header/header.h"

using namespace zero;

string Solution::kthLargestNumber(vector <string> &nums, int k) {
  /*priority_queue<int> pq;
  for (auto s: nums) {
    pq.push(stoi(s));
  }
  while (k-- > 0) {
    pq.pop();
  }
  return to_string(pq.top());*/
  // 降序
  struct compare1 {
      bool operator()(string &a, string &b) {
        if (a.size() != b.size()) return a.size() > b.size();
        // 字典序
        return a > b;
      }
  };

  // 小顶堆默认是升序排列：默认小顶堆应该传入升序比较函数，但是C++的大、小顶堆是和孔洞节点比较进行排序的
  // 因此传入的排序函数恰好相反：小顶堆传入降序，大顶堆传入升序
  // https://www.cnblogs.com/chenleideblog/p/12745271.html
  // 小顶堆
  priority_queue <string, vector<string>, compare1> minHeap;
  for (string &num: nums) {
    minHeap.push(num);
    if (minHeap.size() > k) {
      minHeap.pop();
    }
  }

  return minHeap.top();

  // 快速选择
  nth_element(begin(nums), begin(nums) + k - 1, end(nums), compare1());
  return nums[k - 1];

  // 升序
  struct compare2 {
      bool operator()(string &a, string &b) {
        if (a.size() != b.size()) return a.size() < b.size();
        // 字典序
        return a < b;
      }
  };

  // 大顶堆
  make_heap(nums.begin(), nums.end(), compare2()); // heapify cost O(N)
  while (k-- > 1) {
    pop_heap(nums.begin(), nums.end(), compare2());
    nums.pop_back();
  }
  return nums.front();


}

