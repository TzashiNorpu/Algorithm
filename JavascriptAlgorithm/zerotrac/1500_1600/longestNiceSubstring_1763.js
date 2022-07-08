var longestNiceSubstring = function (s) {
    if (s.length < 2) return "";
    let len = 0, res = '';
    for (let i = 0; i < s.length - 1; i++) {
        for (let j = i + 1; j < s.length; j++) {
            let tmp = s.slice(i, j + 1);
            if (tmp.length > len && check(tmp)) {
                len = tmp.length;
                res = tmp;
            }
        }
    }
    return res;
};

function check(s) {
    const set = new Set();
    for (let c of s) {
        set.add(c);
    }
    for (let c of s) {
        if (!set.has(c.toUpperCase())
            || !set.has(c.toLowerCase())) return false;
    }
    return true;
}

export {longestNiceSubstring};