#include <iostream>
#include "ZeroTrac/1600_1800/header.h"


int main() {
    ZeroTrac::FrontMiddleBackQueue ins;
    ins.pushBack(10);
    ins.popMiddle();
    return 0;

}
