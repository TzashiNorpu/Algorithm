var hasAllCodes = function (s, k) {
    let set = new Set();
    for (let i = 0; i <= s.length - k; i++) {
        set.add(s.substr(i, k));
    }
    return set.size == Math.pow(2, k);
};
export {hasAllCodes};