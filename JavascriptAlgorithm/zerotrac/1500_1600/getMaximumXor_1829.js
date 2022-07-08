var getMaximumXor = function (nums, maximumBit) {
    let temp = 0, n = nums.length, index = n;
    let res = new Array(n);
    let comp = (1 << maximumBit) - 1;
    while (index) {
        temp ^= nums[n - index];
        res[--index] = comp - temp & comp;
    }
    return res;
};
export {getMaximumXor};