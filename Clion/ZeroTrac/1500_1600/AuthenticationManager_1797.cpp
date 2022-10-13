//
// Created by TzashiNorpu on 7/12/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

AuthenticationManager_1797::AuthenticationManager_1797(int timeToLive) {
  this->ttl = timeToLive;
}

int AuthenticationManager_1797::countUnexpiredTokens(int currentTime) {
  int tot = 0;
  for (auto kv: map)
    if (kv.second > currentTime) tot++;
  return tot;
}

void AuthenticationManager_1797::generate(string tokenId, int currentTime) {
  map[tokenId] = currentTime + this->ttl;
}

void AuthenticationManager_1797::renew(string tokenId, int currentTime) {
  if (this->map.count(tokenId) != 0
      && map[tokenId] > currentTime)
    map[tokenId] = currentTime + this->ttl;
}
