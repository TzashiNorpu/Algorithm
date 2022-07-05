var largestValsFromLabels = function (values, labels, numWanted, useLimit) {
    const obj = [];
    for (let i = 0; i < values.length; i++) {
        obj.push({key: labels[i], value: values[i]});
    }
    obj.sort((a, b) => a.value - b.value);
    let result = 0;
    const map = new Map();
    while (obj.length > 0 && numWanted > 0) {
        let pop = obj.pop();
        map.set(pop.key, (map.get(pop.key) || 0) + 1);
        if (map.get(pop.key) <= useLimit) {
            result += pop.value;
            numWanted--;
        }
    }
    return result;
};
export {largestValsFromLabels};