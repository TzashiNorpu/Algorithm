var twoSum = function (nums, target) {
  let map = new Map();
  let res = [];
  for (let index = 0; index < nums.length; index++) {
    if (map.get(target - nums[index]) != undefined) {
      res[0] = map.get(target - nums[index]);
      res[1] = index;
    } else {
      map.set(nums[index], index);
    }
  }
  return res;
};

var twoSum1 = function (nums, target) {
  let obj = {};
  let res = [];
  for (let index = 0; index < nums.length; index++) {
    if (target - nums[index] in obj) {
      return (res = [obj[target - nums[index]], index]);
    }
    obj[nums[index]] = index;
  }
  return res;
};

export {twoSum,twoSum1};