var combine = function (n, k) {
  // 1 - n 所有 k 个数
  let res = [];
  const dfs = (begin, temp) => {
    if (temp.length === k) {
      res.push([...temp]);
      return;
    }
    for (let i = begin; i <= n; i++) {
      temp.push(i);
      dfs(i + 1, temp);
      // dfs(begin + 1, temp);
      temp.pop();
    }
  };
  dfs(1, []);
  return res;
};

export { combine };
