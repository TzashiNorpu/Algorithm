import { TreeNode } from "./TreeNode.js";
var serialize = function (root) {
  const dfs = (node) => {
    if (!node) {
      return "X,";
    }
    return "" + node.val + "," + dfs(node.left) + dfs(node.right);
  };
  const str = dfs(root);
  return str.slice(0, str.length - 1);
};

var deserialize = function (data) {
  //
  data = data.split(",");
  /* const dfs = () => {
    if (data[0] === "X") {
      data.shift();
      return null;
    }
    let node = new TreeNode(+data.shift());
    node.left = dfs();
    node.right = dfs();
    return node;
  };
  return dfs(); */
  let i = 0;
  const dfs = () => {
    if (data[i] === "X") {
      return null;
    }
    let node = new TreeNode(+data[i]);
    node.left = dfs(++i);
    node.right = dfs(++i);
    return node;
  };
  return dfs();
};

export { serialize, deserialize };
