var reorderedPowerOf2 = function (n) {
    const set = new Set();

    for (let n = 1; n <= 1e9; n <<= 1) {
        set.add(countDigits(n));
    }

    return set.has(countDigits(n));
};

const countDigits = (n) => {
    const cnt = new Array(10).fill(0);
    while (n) {
        cnt[n % 10]++;
        n = Math.floor(n / 10);
    }
    return cnt.join('');
}

export {reorderedPowerOf2};