var isIdealPermutation = function (nums) {
    /*
    If the number of global inversions is equal to the number of local inversions,
    it means that all global inversions in permutations are local inversions.
    It also means that we can not find A[i] > A[j] with i+2<=j.
    In other words, max(A[i]) < A[i+2]
    */
    let cmax = 0;
    for (let i = 0; i < nums.length - 2; i++) {
        cmax = Math.max(cmax, nums[i]);
        if (cmax > nums[i + 2]) return false;
    }
    return true;
};