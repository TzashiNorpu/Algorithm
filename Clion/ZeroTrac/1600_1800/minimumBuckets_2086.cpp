#include "header.h"

using namespace ZeroTrac;

int Solution::minimumBuckets_2086(string street){
  for(int i=0;i<street.size();i++){
    if (street[i]=='H'){
      if (i>0 && street[i-1]=='B') continue;
      if(i<street.size()-1 && street[i+1]=='.') street[i+1]='B';
      else if(i>0 && street[i-1]=='.') street[i-1]='B';
      else return -1;      
    }
  }
  return count(begin(street),end(street),'B');
}