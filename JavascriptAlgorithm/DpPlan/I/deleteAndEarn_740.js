var deleteAndEarn = function (nums) {
  // 2,2,3,3,3,4
  // 0,0,2,3,1
  let max = nums.reduce((max, curr) => Math.max(max, curr), 0);
  let res = 0;
  let all = new Array(max + 1).fill(0);
  nums.map((item) => {
    all[item] = all[item] + 1;
  });
  let dp = [];
  dp[0] = 0;
  dp[1] = all[1];
  all.forEach((item, index) => {
    if (index >= 2) {
      dp[index] = Math.max(dp[index - 1], dp[index - 2] + index * item);
    }
    res = Math.max(res, dp[index]);
  });
  return res;
};

export { deleteAndEarn };
