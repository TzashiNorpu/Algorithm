var isValidBST = function (root) {
  // left  root  right
  let res = [];
  const dfs = (node) => {
    if (node === null) {
      return true;
    }
    let left = dfs(node.left);
    if (res.length > 0 && node.val <= res[res.length - 1]) {
      return false;
    } else {
      res.push(node.val);
    }
    let right = dfs(node.right);
    return left && right;
  };
  return dfs(root);
};

export { isValidBST };
