var partitionDisjoint = function (nums) {
    let l = 0, r = nums.length - 1;
    let dpMax = [];
    dpMax.push(nums[l]);
    let dpMin = [];
    dpMin.push(nums[r])
    for (let num of nums) {
        if (num > dpMax.at(-1)) dpMax.push(num);
        else dpMax.push(dpMax.at(-1));
    }
    for (let index = r - 1; index >= 0; index--) {
        if (nums[index] < dpMin[0]) dpMin.unshift(nums[index]);
        else dpMin.unshift(dpMin[0]);
    }
    for (let i = 1; i <= r; i++) {
        if (dpMax[i] <= dpMin[i]) return i;
    }
};
export {partitionDisjoint};