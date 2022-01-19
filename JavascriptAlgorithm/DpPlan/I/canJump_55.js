var canJump = function (nums) {
  // 3,2,2,0,4
  /* let distance = nums.length - 1;
  for (let i = nums.length - 1; i > 0; i--) {
    if (i - 1 + nums[i - 1] >= distance) {
      distance = i - 1;
    }
  }
  return distance == 0; */
  /* let distance = nums[0];
  for (let i = 0; i <= distance; i++) {
    distance = Math.max(distance, i + nums[i]);
    if (distance >= nums.length - 1) {
      return true;
    }
  }
  return false; */
  // 0,2,2,0,4
  /* let distance = nums[0];
  let len = nums.length;
  for (let i = 0; i < len; i++) {
    if (i > distance) {
      return false;
    }
    distance = Math.max(distance, i + nums[i]);
    if (distance >= len - 1) {
      return true;
    }
  }
  return false; */
  // https://leetcode-cn.com/problems/jump-game/solution/45-tiao-yue-you-xi-ii-xiao-tu-zi-tiao-ta-gllu/
  // dp[i] = Math.max(dp[i-1],nums[i]+i);
  if (nums.length < 2) {
    return true;
  }
  let dp = [];
  dp[0] = nums[0];
  let max = nums[0];
  for (let i = 1; i < nums.length; i++) {
    if (i > max) return false;
    dp[i] = Math.max(dp[i - 1], nums[i] + i);
    max = Math.max(max, dp[i]);
    if (max > nums.length) {
      return true;
    }
  }
  return true;
};

export { canJump };
