var isPathCrossing = function (path) {
    const map = new Map();
    let pos = [0, 0];
    map.set(0, 1);
    for (let i = 0; i < path.length; i++) {
        let s = path[i];
        if (s == 'N') {
            pos[0] += 1;
        }
        if (s == 'S') {
            pos[0] -= 1;
        }
        if (s == 'E') {
            pos[1] += 1;
        }
        if (s == 'W') {
            pos[1] -= 1;
        }
        let v = pos[0] * 1000 + pos[1];
        let count = map.get(v) || 0;
        if (count == 1) return true;
        map.set(v, count + 1);
    }
    return false;
};
export {isPathCrossing};