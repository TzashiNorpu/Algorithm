var levelOrder1 = function (root) {
  let res = [];
  res.push([root.val]);
  let stack = [];

  function traverse(node) {
    if (node.children === undefined) {
      return;
    }
    let temp = new Array();
    for (const child of node.children) {
      temp.push(child.val);
      stack.push(child);
    }
    res.push(temp);
    while (stack.length > 0) {
      let pop = stack.shift();
      traverse(pop);
    }
  }
  traverse(root);
  return res;
};
var levelOrder2 = function (root) {
  let res = [];
  res.push([root.val]);
  let stack = [];
  stack.push(root);
  while (stack.length > 0) {
    // for (const node of stack) {
    let node = stack.shift();
    if (node.children !== undefined) {
      let temp = [];
      for (const child of node.children) {
        temp.push(child.val);
        stack.push(child);
      }
      res.push(temp);
    }
  }
  return res;
};
export { levelOrder1, levelOrder2 };
