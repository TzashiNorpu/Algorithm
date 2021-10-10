var twoSum = function (nums, target) {
  let map = new Map();
  for (let index = 0; index < nums.length; index++) {
    // 2:0 7:1
    if (map.get(target - nums[index]) !== undefined) {
      return [map.get(target - nums[index]), index];
    } else {
      map.set(nums[index], index);
    }
  }
  return [];
};

export { twoSum };
