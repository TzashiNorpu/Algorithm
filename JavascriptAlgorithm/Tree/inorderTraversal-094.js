var inorderTraversal = function (root) {
  let res = [];
  function traverse(root) {
    // left root right
    if (root === null) {
      return;
    }
    traverse(root.left);
    res.push(root.val);
    traverse(root.right);
  }
  traverse(root);
  return res;
};

export { inorderTraversal };
