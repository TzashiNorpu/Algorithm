var minDepth1 = function (root) {
  if (!root) {
    return 0;
  }
  let depth = Infinity;
  const dfs = (level, node) => {
    if (!node) {
      return;
    }
    if (!node.left && !node.right) {
      depth = Math.min(level, depth);
    }
    dfs(level + 1, node.left);
    dfs(level + 1, node.right);
  };
  dfs(1, root);
  return depth;
};

var minDepth = function (node) {
  if (!node) {
    return Infinity;
  }
  if (!node.left && !node.right) {
    return 1;
  }
  return Math.min(minDepth(node.left) + 1, minDepth(node.right) + 1);
};
var minDepth2 = function (root) {
  return !root ? 0 : minDepth(root);
};
export { minDepth1, minDepth2 };
