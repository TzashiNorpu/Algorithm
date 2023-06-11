//
// Created by tseringnorpu on 6/11/2023.
//
#include "../header/header.h"
using namespace zero;
OrderedStream::OrderedStream(int n) {
    stream.resize(n + 1);
    ptr = 1;
}

vector <string> OrderedStream::insert(int idKey, string value) {
    stream[idKey] = value;
    vector<string> res;
    while (ptr < stream.size() && !stream[ptr].empty()) {
        res.push_back(stream[ptr]);
        ++ptr;
    }
    return res;
}