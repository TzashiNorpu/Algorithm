//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

string Solution::entityParser(string text) {
  const unordered_map <string, string>
          m = {{"&quot;",  "\""},
               {"&apos;",  "\'"},
               {"&amp;",   "&"},
               {"&gt;",    ">"},
               {"&lt;",    "<"},
               {"&frasl;", "/"}};
  for (auto &&[key, val]: m) {
    regex e(key);
    text = regex_replace(text, e, val);
  }
  return text;
}