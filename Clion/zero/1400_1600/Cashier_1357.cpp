//
// Created by TzashiNorpu on 2023/6/19.
//
#include "../header/header.h"

using namespace zero;

Cashier::Cashier(int n, int discount, vector<int> &products, vector<int> &prices) {
  this->discount_index = n;
  this->discount = discount;
  int len = products.size();
  for (int i = 0; i < len; ++i) {
    this->price_map[products[i]] = prices[i];
  }
}

double Cashier::getBill(vector<int> product, vector<int> amount) {
  double res = 0.0;
  int n = product.size();
  for (int i = 0; i < n; ++i) {
    res += (this->price_map[product[i]] * amount[i] * 1.0);
  }
  this->customer_index++;
  //printf("this->customer_index=%d,this->discount_index=%d\n",this->customer_index,this->discount_index);
  if (this->customer_index % this->discount_index == 0) res *= ((double) 100.0 - this->discount) / (double) 100.0;
  return res;
}