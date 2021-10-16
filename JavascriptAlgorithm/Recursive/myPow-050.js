var myPow = function (x, n) {
  if (!x) {
    return 0;
  }
  if (x === 1) {
    return x;
  }
  if (!n) {
    return 1;
  }
  if (n < 0) {
    n = -n;
    x = 1 / x;
  }
  const recursive = (x, n) => {
    if (n === 1) {
      return x;
    }
    let temp = recursive(x, parseInt(n / 2));
    return temp * temp * (n % 2 === 1 ? x : 1);
  };
  return recursive(x, n);
};

export { myPow };
