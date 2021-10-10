var groupAnagrams = function (strs) {
  let map = new Map();
  for (let i = 0; i < strs.length; i++) {
    let chars = strs[i].split("");
    let sortStr = chars.sort().join("");
    if (map.get(sortStr) !== undefined) {
      map.get(sortStr).push(strs[i]);
    } else {
      map.set(sortStr, [strs[i]]);
    }
  }
  return [...map.values()];
};

export { groupAnagrams };
