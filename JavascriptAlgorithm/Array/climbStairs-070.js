var climbStairs1 = function (n) {
  // 1 1 2 3 5 8
  let pprev = 0,
    prev = 1,
    curr = 0;
  for (let index = 1; index <= n; index++) {
    curr = prev + pprev;
    pprev = prev;
    prev = curr;
  }
  return curr;
};

var climbStairs2 = function (n) {
  if (n <= 2) {
    return n;
  }
  let res = [1, 2];
  for (let index = 2; index < n; index++) {
    res.push(res[index - 1] + res[index - 2]);
  }
  return res[n - 1];
};

var climbStairs3 = function (n) {
  if (n <= 3) {
    return n;
  }
  return climbStairs3(n - 1) + climbStairs3(n - 2);
};

export { climbStairs1, climbStairs2, climbStairs3 };
