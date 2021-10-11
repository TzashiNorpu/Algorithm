var postorderTraversal = function (root) {
  // left right root
  let res = [];
  function traverse(node) {
    if (node === null) {
      return;
    }
    traverse(node.left);
    traverse(node.right);
    res.push(node.val);
  }
  traverse(root);
  return res;
};
export { postorderTraversal };
