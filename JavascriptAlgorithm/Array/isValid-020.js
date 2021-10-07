var isValid = function (s) {
  let stack = [];
  let pos = 0;
  for (const c of s) {
    if (c === ")") {
      if (stack[pos - 1] === "(") {
        pos--;
      } else {
        return false;
      }
    } else if (c === "}") {
      if (stack[pos - 1] === "{") {
        pos--;
      } else {
        return false;
      }
    } else if (c === "]") {
      if (stack[pos - 1] === "[") {
        pos--;
      } else {
        return false;
      }
    } else {
      stack[pos++] = c;
    }
  }
  return pos === 0;
};

export { isValid };
