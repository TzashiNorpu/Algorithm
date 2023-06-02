//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../header/header.h"

using namespace zero;

int Solution::numUniqueEmails(vector <string> &emails) {
  unordered_set <string> st;
  for (string &email: emails) {
    string cleanEmail;
    for (char c: email) {
      if (c == '+' || c == '@') break;
      if (c == '.') continue;
      cleanEmail += c;
    }
    cleanEmail += email.substr(email.find('@'));
    st.insert(cleanEmail);
  }
  return st.size();
}