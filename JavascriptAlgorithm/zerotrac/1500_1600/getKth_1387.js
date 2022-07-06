var getKth = function (lo, hi, k) {
    const nums = new Array(hi - lo + 1);
    const pq = new Array(hi - lo + 1);
    for (let i = lo; i <= hi; i++) {
        nums[i - lo] = i;
        let steps = getSteps(i);
        pq[i - lo] = {key: steps, value: i};
    }
    pq.sort((a, b) => {
        if (a.key == b.key) return a.value - b.value;
        else return a.key - b.key;
    })
    return pq[k - 1].value;

};
function getSteps(num) {
    let step = 0;
    while (num != 1) {
        if (num % 2) {
            num = num * 3 + 1;
        } else {
            num = parseInt(num / 2);
        }
        step++;
    }
    return step;
}
export {getKth};