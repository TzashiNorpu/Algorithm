//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

int Solution::daysBetweenDates(string date1, string date2) {
  int days[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  // 普通年能被4整除且不能被100整除的为闰年。（如2004年就是闰年，1900年不是闰年）
  // 世纪年能被400整除的是闰年。（如2000年是闰年，1900年不是闰年）
  function<bool(int)> isLeapYear = [&](int year) -> bool {
      return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  };
  function<int(string)> daysFrom1971 = [&](string dt) -> int {
      int y = stoi(dt.substr(0, 4)), m = stoi(dt.substr(5, 2)), d = stoi(dt.substr(8));
      for (int iy = 1971; iy < y; ++iy)
        d += isLeapYear(iy) ? 366 : 365;
      // 闰月 29 天
      return d + (m > 2 && isLeapYear(y)) + accumulate(begin(days), begin(days) + m - 1, 0);
  };
  return abs(daysFrom1971(date1) - daysFrom1971(date2));
}