var jump = function (nums) {
  /* let step = 0;
  let far = 0;
  let preFar = far;
  // 2,3,1,1,4
  for (let i = 0; i < nums.length - 1; i++) {
    if (i + nums[i] > far) {
      far = nums[i] + i;
    }
    if (i == preFar) {
      preFar = far;
      step++;
    }
  }
  return step; */
  // 2, 3, 1, 1, 4
  /* let step = 0;
  let far = 0;
  let max = 0;
  for (let i = 0; i <= far; i++) {
    max = Math.max(max, i + nums[i]);
    if (far >= nums.length - 1) {
      return step;
    }
    if (i == far) {
      far = max;
      step++;
    }
  }
  return step; */
  // 2, 3, 1, 1, 4
  // https://leetcode-cn.com/problems/jump-game/solution/45-tiao-yue-you-xi-ii-xiao-tu-zi-tiao-ta-gllu/
  /* 用一个指针遍历dp找到所有的位置能到的最小步数，用另一个指针来遍历dp获取得到离最后一个点最远的能够一次到达最后一个点的指针位置。
获得动态转化方程：
dp[i] = dp[j] + 1 */

  if (nums.length < 2) {
    return 0;
  }
  let dp = [];
  dp[0] = 0;
  for (let i = 1, j = 0; i < nums.length; i++) {
    // 获取得到离最后一个点最远的能够一次到达最后一个点的指针位置
    while (j + nums[j] < i) j++;
    dp[i] = dp[j] + 1;
  }
  return dp[nums.length - 1];
};

export { jump };
