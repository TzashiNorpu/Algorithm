var minDeletion = function (nums) {
    let n = nums.length;
    let op = 0;
    for (let i = 0; i < n; i++) {
        if ((i - op) % 2 == 0 && i + 1 < n && nums[i] == nums[i + 1]) {
            op++;
        }
    }
    if ((n - op) % 2) op++;
    return op;
};
export {minDeletion};