var subsets = function (nums) {
  let res = [];
  let len = nums.length;
  const recursive = (curr, temp) => {
    if (curr === len) {
      res.push([...temp]);
      return;
    }
    temp.push(nums[curr]);
    recursive(curr + 1, temp);
    temp.pop();
    recursive(curr + 1, temp);
  };
  recursive(0, []);
  return res;
};
export { subsets };
