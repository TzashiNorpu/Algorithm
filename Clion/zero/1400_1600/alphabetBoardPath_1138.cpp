//
// Created by tseringnorpu on 6/7/2023.
//
#include "../header/header.h"
using namespace zero;

string Solution::alphabetBoardPath(string target) {
    /*string res;
    int x=0,y=0;
    for (auto ch : target) {
        // 先回 a 列
        int x1 = (ch - 'a') % 5, y1 = (ch - 'a') / 5;
        res += string(max(0, y - y1), 'U') + string(max(0, x1 - x), 'R') +
               string(max(0, x - x1), 'L') + string(max(0, y1 - y), 'D') + "!";
        x = x1, y = y1;
    }
    return res;*/
    // 优先往回和往左走  不然 z 节点会超出范围
    string board[6]= {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
    unordered_map<char,vector<int>> pos_map;
    for (int i = 0; i < 6; ++i) {
        for (int j = 0; j < board[i].size(); ++j) {
            //printf("%c\n",board[i][j]);
            pos_map[board[i][j]] = {i,j};
        }
    }
    vector<int> pos = {0, 0};
    string res="";
    for (auto c: target) {
        vector<int> new_pos = pos_map[c];
        if (new_pos[1]<pos[1]){
            for (int i = new_pos[1]; i < pos[1]; ++i) {
                res += 'L';
            }
        }
        if (new_pos[0]<pos[0]){
            for (int i = new_pos[0]; i < pos[0]; ++i) {
                res += 'U';
            }
        }
        if (new_pos[1]>pos[1]){
            for (int i = pos[1]; i < new_pos[1]; ++i) {
                res += 'R';
            }
        }
        if (new_pos[0]>pos[0]){
            for (int i = pos[0]; i < new_pos[0]; ++i) {
                res += 'D';
            }
        }
        res += '!';
        pos = new_pos;
    }
    return res;
}