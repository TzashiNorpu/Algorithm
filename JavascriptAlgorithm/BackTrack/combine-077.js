var combine = function (n, k) {
  // 1 - n 所有 k 个数
  let res = [];
  const dfs = (begin, level, temp) => {
    if (level === 0) {
      res.push([...temp]);
      return;
    }
    for (let i = begin; i < begin + k; i++) {}
  };
  return res;
};
