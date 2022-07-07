var minDeletions = function (s) {
    const count = new Array(26);
    count.fill(0);
    for (let i = 0; i < s.length; i++) {
        count[s[i].charCodeAt() - 'a'.charCodeAt()]++;
    }
    let set = new Set();
    let res = 0;
    for (let i = 0; i < 26; i++) {
        if (!set.has(count[i])) {
            set.add(count[i]);
        } else {
            while (count[i] > 0 && set.has(count[i])) {
                count[i]--;
                res++;
            }
            set.add(count[i]);
        }
    }
    return res;
};

export {minDeletions};