//
// Created by TzashiNorpu on 7/21/2022.
//
#include "header.h"

using namespace ZeroTrac;

TimeMap_981::TimeMap_981() {

}

void TimeMap_981::set(string key, string value, int timestamp) {
    m[key].insert({timestamp, value});
}

string TimeMap_981::get(string key, int timestamp) {
    auto it = m[key].upper_bound(timestamp);
    return it == m[key].begin() ? "" : prev(it)->second;
}