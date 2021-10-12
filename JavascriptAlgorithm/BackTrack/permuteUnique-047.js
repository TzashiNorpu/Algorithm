var permuteUnique = function (nums) {
  let res = [];
  let selected = new Array(nums.length);
  const dfs = (level, len, temp) => {
    if (level === len) {
      res.push([...temp]);
      return;
    }
    for (let i = 0; i < len; i++) {
      if (i > 0 && nums[i] === nums[i - 1] && !selected[i - 1]) {
        continue;
      }
      if (!selected[i]) {
        selected[i] = true;
        temp.push(nums[i]);
        dfs(level + 1, len, temp);
        temp.pop();
        selected[i] = false;
      }
    }
  };
  nums.sort();
  dfs(0, nums.length, []);
  return res;
};

export { permuteUnique };
