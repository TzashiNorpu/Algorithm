var isAnagram1 = function (s, t) {
  return s.split("").sort().join("") === t.split("").sort().join("");
};

var isAnagram2 = function (s, t) {
  let map = new Map();
  if (s.length !== t.length) {
    return false;
  }
  for (const char of s) {
    if (map.get(char) !== undefined) {
      map.set(char, map.get(char) + 1);
    } else {
      map.set(char, 1);
    }
  }
  for (const char of t) {
    if (map.get(char) !== undefined) {
      map.set(char, map.get(char) - 1);
    } else {
      map.set(char, 1);
    }
  }
  for (const cnt of map.values()) {
    if (cnt !== 0) {
      return false;
    }
  }
  return true;
};

export { isAnagram1, isAnagram2 };
