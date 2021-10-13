var maxDepth = function (root) {
  /* let depth = 0;
  const dfs = (node, level) => {
    if (node === null) {
      if (level > depth) {
        depth = level;
      }
      return;
    }
    dfs(node.left, level + 1);
    dfs(node.right, level + 1);
  };
  dfs(root, 0);
  return depth; */

  if (!root) {
    return 0;
  }
  let left = maxDepth(root.left);
  let right = maxDepth(root.right);
  return Math.max(left, right) + 1;
};

export { maxDepth };
