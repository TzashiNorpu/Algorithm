var totalFruit = function (fruits) {
    const window = new Map();
    let len = 0;
    for (let l = 0, r = 0; r < fruits.length; r++) {
        window.set(fruits[r], (window.get(fruits[r]) || 0) + 1);
        if (window.size > 2) {
            window.set(fruits[l], window.get(fruits[l]) - 1);
            if (window.get(fruits[l]) == 0) window.delete(fruits[l]);
            l++;
        }
        len = Math.max(len, r - l + 1);
    }
    return len;
};

export {totalFruit};