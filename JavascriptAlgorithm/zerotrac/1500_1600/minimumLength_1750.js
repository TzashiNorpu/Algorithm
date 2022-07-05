var minimumLength = function (s) {
    let l = 0, r = s.length - 1;
    while (l < r && s[l] == s[r]) {
        while (l <= r && s[l] == s[l + 1]) l++;
        while (l <= r && s[r] == s[r - 1]) r--;
        l++;
        r--;
    }
    return l > r ? 0 : r - l + 1;
};
export {minimumLength};