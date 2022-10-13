//
// Created by TzashiNorpu on 10/12/2022.
//
#include <sstream>
#include "../header/1600_1800.h"

using namespace ZeroTrac;

vector<string> Solution::invalidTransactions(vector<string> &transactions) {
  vector<string> res;
  int n = transactions.size();
  vector<string> name(n);
  vector<int> time(n);
  vector<int> money(n);
  vector<string> city(n);
  vector<bool> add(n);
  for (int i = 0; i < n; ++i) {
    istringstream ss(transactions[i]);
    string token = "";
    getline(ss, token, ',');
    name[i] = token;
    getline(ss, token, ',');
    time[i] = stoi(token);
    getline(ss, token, ',');
    money[i] = stoi(token);
    getline(ss, token, ',');
    city[i] = token;
  }

  for (int i = 0; i < n; ++i) {
    if (money[i] > 1000) add[i] = true;
    for (int j = i + 1; j < n; ++j) {
      if (name[i] == name[j] && abs(time[i] - time[j]) <= 60 && city[i] != city[j]) add[i] = true, add[j] = true;
    }
  }
  for (int i = 0; i < n; ++i) {
    if (add[i]) res.push_back(transactions[i]);
  }
  return res;
}