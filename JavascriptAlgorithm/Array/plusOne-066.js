var plusOne = function (digits) {
  let carry = 1;
  for (let i = digits.length - 1; i >= 0; i--) {
    let temp = carry;
    carry = parseInt((digits[i] + carry) / 10);
    digits[i] = parseInt((digits[i] + temp) % 10);
  }
  if (carry == 1) {
    digits.unshift(1);
  }

  return digits;
};

export {plusOne}
