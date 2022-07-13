//
// Created by TzashiNorpu on 7/13/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool validTicTacToe_794::validTicTacToe(vector<string> &board) {
    int turns = 0;
    bool xwin = false, owin = false;
    vector<int> rows(3, 0), cols(3, 0);
    int pie = 0, na = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == 'X') {
                turns++;
                rows[i]++;
                cols[j]++;
                if (i == j) na++;
                if (i + j == 2) pie++;
            } else if (board[i][j] == 'O') {
                turns--;
                rows[i]--;
                cols[j]--;
                if (i == j) na--;
                if (i + j == 2) pie--;
            }
        }
    }
    xwin = rows[0] == 3 || rows[1] == 3 || rows[2] == 3 ||
           cols[0] == 3 || cols[1] == 3 || cols[2] == 3 ||
           pie == 3 || na == 3;
    owin = rows[0] == -3 || rows[1] == -3 || rows[2] == -3 ||
           cols[0] == -3 || cols[1] == -3 || cols[2] == -3 ||
           pie == -3 || na == -3;
    if (xwin && turns == 0 || owin && turns == 1) return false;
    return (turns == 0 || turns == 1) && (!xwin || !owin);
}