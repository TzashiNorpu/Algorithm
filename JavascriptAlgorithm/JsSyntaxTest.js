let arr = [1, 2, 3];
console.log(arr.values());
let map = new Map();
map.set(0, 1);
map.set(1, 2);
map.set(2, 3);
console.log(map.values());
let arr1 = new Map(Object.entries(arr));
console.log(arr1.values());
