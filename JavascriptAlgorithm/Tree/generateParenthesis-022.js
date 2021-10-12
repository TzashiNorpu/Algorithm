var generateParenthesis = function (n) {
  let res = [];
  const gen = (lCnt, rCnt, str) => {
    if (lCnt === n && rCnt === n) {
      //   console.log(str);
      res.push(str);
      return;
    }
    if (lCnt <= n) {
      gen(lCnt + 1, rCnt, str + "(");
    }

    if (rCnt < lCnt) {
      gen(lCnt, rCnt + 1, str + ")");
    }
  };
  gen(0, 0, "");
  return res;
};

export { generateParenthesis };
