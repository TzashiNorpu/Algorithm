var permute = function (nums) {
  let res = [];
  let sels = new Array(nums.length);
  const dfs = (level, len, temp) => {
    if (level === len) {
      // 扩展运算符
      res.push([...temp]);
      return;
    }
    for (let i = 0; i < nums.length; i++) {
      if (!sels[i]) {
        temp.push(nums[i]);
        sels[i] = true;
        dfs(level + 1, len, temp);
        sels[i] = false;
        temp.pop();
      }
    }
  };
  dfs(0, nums.length, []);
  return res;
};
export { permute };
