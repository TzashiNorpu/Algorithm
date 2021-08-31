var plusOne = function (digits) {
  let carry = 0;
  for (let i = digits.length - 1; i >= 0; i--) {
    if (i == digits.length - 1) {
        carry = 1;
    }
    carry = (digits[i] + carry) / 10;
    digits[i] = (digits[i] + temp) % 10;
  }
  return digits;
};

let digits = [1, 8, 9];
res = plusOne(digits);
console.log(res)
