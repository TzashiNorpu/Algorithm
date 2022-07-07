var delNodes = function (root, to_delete) {
    const res = [];
    function dfs(root) {
        if (root == null) return null;
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        if (to_delete.includes(root.val)) {
            if (root.left != null) res.push(root.left);
            if (root.right != null) res.push(root.right);
            return null;
        } else return root;
    }
    let r = dfs(root);
    if (r != null) res.push(r);
    return res;
};