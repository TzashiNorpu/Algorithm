var lowestCommonAncestor = function (root, p, q) {
  if (!root) {
    return null;
  }
  if (root.val === p || root.val === q) {
    return root;
  }
  let left = lowestCommonAncestor(root.left, p, q);
  let right = lowestCommonAncestor(root.right, p, q);
  if (!left && !right) {
    return null;
  }
  if (left && right) {
    return root;
  }
  return left || right;
};

export { lowestCommonAncestor };
