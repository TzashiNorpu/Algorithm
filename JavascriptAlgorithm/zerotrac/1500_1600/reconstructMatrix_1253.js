var reconstructMatrix = function (upper, lower, colsum) {
    let n = colsum.length;
    const res = new Array(2);
    res[0] = new Array(n);
    res[1] = new Array(n);
    for (let i = 0; i < n; i++) {
        let count = colsum[i];
        res[0][i] = ((count == 2) ? 1 : (count == 1 ? (upper >= lower ? 1 : 0) : 0));
        res[1][i] = ((count == 2) ? 1 : (count == 1 ? (upper < lower ? 1 : 0) : 0));
        if (res[0][i] == 1) upper--;
        if (res[1][i] == 1) lower--;
    }
    return upper == 0 && lower == 0 ? res : [];
};
export {reconstructMatrix};