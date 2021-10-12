var postorder = function (root) {
  //  left rigtht root
  let res = [];
  if (!root) {
    return res;
  }
  const dfs = (node) => {
    if (!node) {
      return;
    }
    if (node.children) {
      for (const subNode of node.children) {
        dfs(subNode);
      }
    }
    res.push(node.val);
  };
  dfs(root);
  return res;
};

export { postorder };
