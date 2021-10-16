var levelOrder1 = function (root) {
  let res = [];
  if (!root) {
    return res;
  }
  let stack = [];
  stack.push(root);
  const traverse = () => {
    while (stack.length > 0) {
      let len = stack.length;
      let tmp = [];
      for (let i = 0; i < len; i++) {
        // 可以用所有指针
        let pop = stack.shift();
        tmp.push(pop.val);
        if (pop.left) {
          stack.push(pop.left);
        }
        if (pop.right) {
          stack.push(pop.right);
        }
      }
      res.push([...tmp]);
    }
  };
  traverse();
  return res;
};

var levelOrder2 = function (root) {
  let res = [];
  if (!root) {
    return res;
  }
  let stack = [];
  stack.push(root);
  const traverse = () => {
    while (stack.length > 0) {
      let len = stack.length;
      let tmp = [];
      for (let i = 0; i < len; i++) {
        // 可以用所有指针
        let pop = stack[i];
        tmp.push(pop.val);
        if (pop.left) {
          stack.push(pop.left);
        }
        if (pop.right) {
          stack.push(pop.right);
        }
      }
      res.push([...tmp]);
      stack.splice(0, len);
    }
  };
  traverse();
  return res;
};
export { levelOrder1, levelOrder2 };
