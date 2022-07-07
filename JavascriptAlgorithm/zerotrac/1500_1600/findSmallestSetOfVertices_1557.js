var findSmallestSetOfVertices = function (n, edges) {
    const set = new Set();
    for (let edge of edges) {
        set.add(edge[0]);
        if (set.has(edge[1])) set.delete(edge[1]);
    }
    return Array.from(set.keys());
};