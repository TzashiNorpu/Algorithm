var minimumRefill = function (plants, capacityA, capacityB) {
    let refillCount = 0;
    let n = plants.length;
    let l = 0, r = n - 1;
    let remainA = capacityA;
    let remainB = capacityB;
    while (l < r) {
        if (capacityA >= plants[l]) {
            if (remainA < plants[l]) {
                refillCount++;
                remainA = capacityA;
            }
            remainA -= plants[l];
            l++;
        }
        if (capacityB >= plants[r]) {
            if (remainB < plants[r]) {
                refillCount++;
                remainB = capacityB;
            }
            remainB -= plants[r];
            r--;
        }
    }
    if (l == r) {
        if (remainA >= remainB) {
            if (remainA < plants[l]) refillCount++;
        } else {
            if (remainB < plants[l]) refillCount++;
        }
    }
    return refillCount;
};

export {minimumRefill};