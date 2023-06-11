//
// Created by tseringnorpu on 6/10/2023.
//
#include "../header/header.h"

using namespace zero;

vector <string> Solution::findAndReplacePattern(vector <string> &words, string pattern) {
    unordered_map<char,char> mapping;
    unordered_map<char,char> reverse_mapping;
    vector<string> res;
    for (auto word: words) {
        bool valid=true;
        for (int i=0;i<word.size();i++) {
            char c = word[i];
            char p = pattern[i];
            if (mapping.find(p) == mapping.end() && reverse_mapping.find(c) == reverse_mapping.end()) {
                mapping[p]=c;
                reverse_mapping[c] = p;
            } else if(mapping.find(p)!=mapping.end() && mapping[p]==c
            && reverse_mapping.find(c)!=reverse_mapping.end() && reverse_mapping[c]==p){
                continue;
            }else{
                valid= false;
                break;
            }
        }
        if (valid) {
            res.push_back(word);
        }
        mapping.clear();
        reverse_mapping.clear();
    }
    return res;
}