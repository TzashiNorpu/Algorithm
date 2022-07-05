var subArrayRanges = function (nums) {
    let res = 0;
    for (let i = 0; i < nums.length - 1; i++) {
        let max = nums[i];
        let min = nums[i];
        for (let j = i + 1; j < nums.length; j++) {
            max = Math.max(max, nums[j]);
            min = Math.min(min, nums[j]);
            res += (max - min);
        }
    }
    return res;
};