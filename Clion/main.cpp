#include <iostream>
#include "ZeroTrac/1500_1600/header.h"


int main() {
    ZeroTrac::suggestedProducts_1268 ins;
    vector<string> products = {"moxbile", "mouse", "moneypot", "monitor", "mousepad"};
    string searchWord = "moxuse";
    ins.suggestedProducts(products, searchWord);
    return 0;
}
