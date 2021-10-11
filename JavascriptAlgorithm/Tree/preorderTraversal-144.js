var preorderTraversal = function (root) {
  // root left right
  let res = [];
  function traverse(node) {
    if (node === null) {
      return;
    }
    res.push(node.val);
    traverse(node.left);
    traverse(node.right);
  }
  traverse(root);
  return res;
};
export { preorderTraversal };
