var preorder = function (root) {
  // root left rigth
  let res = [];
  /* if (root === null) {
    return res;
  }
 */
  if (!root) {
    return res;
  }

  function traverse(node) {
    /* if (node === null) {
      return;
    } */

    if (!node) {
      return;
    }
    res.push(node.val);
    // if (node.children !== undefined) {
    if (node.children) {
      for (const subNode of node.children) {
        traverse(subNode);
      }
    }
  }
  traverse(root);
  return res;
};

export { preorder };
