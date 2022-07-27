//
// Created by TzashiNorpu on 7/27/2022.
//
#include "header.h"

using namespace ZeroTrac;


FrontMiddleBackQueue::FrontMiddleBackQueue() {

}

void FrontMiddleBackQueue::pushMiddle(int val) {
    a.push_back(val);
    a2b();
}

void FrontMiddleBackQueue::pushFront(int val) {
    a.push_front(val);
    a2b();
}

void FrontMiddleBackQueue::pushBack(int val) {
    b.push_back(val);
    b2a();
}

int FrontMiddleBackQueue::popMiddle() {
    if (b.empty()) return -1;
    int res = 0;
    if (a.size() == b.size()) {
        res = a.back();
        a.pop_back();
    } else {
        res = b.front();
        b.pop_front();
    }
    return res;
}

int FrontMiddleBackQueue::popFront() {
    if (b.empty()) return -1;
    int res = 0;
    if (a.empty()) {
        res = b.front();
        b.pop_front();
    } else {
        res = a.front();
        a.pop_front();
        b2a();
    }
    return res;
}

int FrontMiddleBackQueue::popBack() {
    if (b.empty()) return -1;
    int res = b.back();
    b.pop_back();
    a2b();
    return res;
}