//
// Created by TzashiNorpu on 7/20/2022.
//
#include "header.h"

using namespace ZeroTrac;

int kthGrammar_779::kthGrammar(int n, int k) {
    if (n == 1) return 0;
    if (k & 1) return (kthGrammar(n - 1, (k + 1) / 2) == 0 ? 0 : 1);
    else return (kthGrammar(n - 1, k / 2) == 0 ? 1 : 0);
}
