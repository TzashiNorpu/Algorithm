var invertTree = function (root) {
  if (!root) {
    return null;
  }
  /* let left = invertTree(root.right);
  let right = invertTree(root.left);
  root.left = left;
  root.right = right; */
  let leftTemp = root.left;
  root.left = invertTree(root.right);
  root.right = invertTree(leftTemp);
  return root;
};
export { invertTree };
