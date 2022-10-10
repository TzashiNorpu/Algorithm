//
// Created by TzashiNorpu on 10/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

/*
 * 根据题目的要求，我们最后需要将数组变为如下形式：
 *  所有奇数下标的元素均相同；
 *  所有偶数下标的元素均相同；
 *  奇数下标的元素和偶数下标的元素不能相同。
 * 由于我们希望操作次数尽可能少，因此我们可以对奇数下标的元素和偶数下标的元素分别建立一个哈希映射，其中键表示某一个元素，值表示该元素出现的次数。这样一来，我们贪心地选择两个哈希映射中值最大的两个键，将所有奇数下标的元素变为奇数哈希映射对应的键，偶数下标的元素变为偶数哈希映射对应的键即可。如果两个键对应的值分别为 xx 和 yy，那么需要修改的次数即为：
 * n - x - y
 * 但这样做并不能保证「奇数下标的元素和偶数下标的元素不能相同」。如果两个键表示的元素不相同，那么上述方法就是正确的，但如果两个键表示的元素相同，那么最终数组并不满足题目要求。因此除了值最大的键以外，我们还需要筛选出值次大的键。如果两个最大键表示的元素相同，那么一个最大键和另一个次大键表示的元素一定不相同，因此修改次数即为「奇数哈希映射最大键对应的值」加上「偶数哈希映射次大键对应的值」与「奇数哈希映射次大键对应的值」加上「偶数哈希映射最大键对应的值」二者中的较大值，再用 nn 减去该值。
 */

int Solution::minimumOperations(vector<int> &nums) {
  int n = nums.size();

  // start = 0 表示偶数下标，start = 1 表示奇数下标
  // 返回值为最大键，最大键对应的值，次大键，次大键对应的值
  auto get = [&](int start) -> tuple<int, int, int, int> {
      unordered_map<int, int> freq;
      for (int i = start; i < n; i += 2) {
        ++freq[nums[i]];
      }

      int fstkey = 0, fstval = 0, sndkey = 0, sndval = 0;
      for (const auto &[key, val]: freq) {
        if (val > fstval) {
          tie(sndkey, sndval) = tuple{fstkey, fstval};
          tie(fstkey, fstval) = tuple{key, val};
        } else if (val > sndval) {
          tie(sndkey, sndval) = tuple{key, val};
        }
      }

      return {fstkey, fstval, sndkey, sndval};
  };

  auto [e1stkey, e1stval, e2ndkey, e2ndval] = get(0);
  auto [o1stkey, o1stval, o2ndkey, o2ndval] = get(1);

  if (e1stkey != o1stkey) {
    return n - (e1stval + o1stval);
  }

  return n - max(e1stval + o2ndval, o1stval + e2ndval);
}