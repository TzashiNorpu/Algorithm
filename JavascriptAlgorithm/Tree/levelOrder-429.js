var levelOrder1 = function (root) {
  let res = [];
  if (root === null) {
    return res;
  }
  function traverse(node, level) {
    if (node === undefined) {
      return;
    }
    if (res[level] === undefined) {
      res[level] = [];
    }
    res[level].push(node.val);
    if (node.children !== undefined) {
      for (const subNode of node.children) {
        traverse(subNode, level + 1);
      }
    }
  }
  traverse(root, 0);
  return res;
};

// stack2
var levelOrder2 = function (root) {
  let res = [];
  let stack = [];
  if (root === null) {
    return res;
  }
  stack.push(root);
  while (stack.length > 0) {
    let temp = [];
    const currLevelLen = stack.length;
    for (let i = 0; i < currLevelLen; i++) {
      let node = stack.shift();
      temp.push(node.val);
      /* let subNodes = new Map(Object.entries(node.children));
      stack.push(subNodes.values()); */
      if (node.children !== undefined) {
        // stack.push([...node.children]);
        for (const subNode of node.children) {
          stack.push(subNode);
        }
      }
    }
    res.push(temp);
  }
  return res;
};

export { levelOrder1, levelOrder2 };
