var tupleSameProduct = function (nums) {
    const n = nums.length;
    const map = new Map();
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            let mul = nums[i] * nums[j];
            map.set(mul, (map.get(mul) || 0) + 1);
        }
    }
    /*
    map 计数大于 1，则说明有两对数满足条件
    假设计数为2： 2*6 == 4*3 则贡献的数目为：2*2*2 -> [2*6 6*2] [3*4  4*3] 
    同时可以交换位置 2*6放置在左侧
    计数 > 2 时选择排列组合 （4，2）
    */
    let res = 0;
    for (let v of map.values()) {
        if (v > 1) res += (v * (v - 1) / 2 * 8);
    }
    return res;
};