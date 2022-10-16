//
// Created by TzashiNorpu on 10/13/2022.
//
#include "1800_1900.h"

using namespace ZeroTrac;

/*
 * 如果 tx=ty，不存在上一个状态，状态 (tx,ty) 即为起点状态；
 * 如果 tx>ty，则上一个状态是 (tx−ty,ty)；
 * 如果 tx<ty，则上一个状态是 (tx,ty−tx)
 * 当 tx>sx,ty>sy,tx!=ty 三个条件同时成立时，执行反向操作，每一步操作更新 (tx,ty) 的值，直到反向操作的条件不成立。
 * 当反向操作的条件不成立时，根据 tx 和 ty 的不同情况分别判断是否可以从起点转换到终点。
 *   如果 tx=sx 且 ty=sy，则已经到达起点状态，因此可以从起点转换到终点。
 *   如果 tx=sx 且 ty!=sy，则 tx 不能继续减小，只能减小 ty，因此只有当 ty>sy 且 (ty−sy) mod sx=0 时可以从起点转换到终点。
 *   如果 ty=sy 且 tx!=sx，则 ty 不能继续减小，只能减小 tx，因此只有当 tx>sx 且 (tx−sx) mod sy=0 时可以从起点转换到终点。
 *   如果 tx!=sx 且 ty!=sy，则不可以从起点转换到终点 */
bool Solution::reachingPoints(int sx, int sy, int tx, int ty) {
  while (sx < tx && sy < ty) {
    if (tx < ty) ty %= tx;
    else tx %= ty;
  }
  printf("sx=%d,sy=%d,tx=%d,ty=%d\n", sx, sy, tx, ty);
  return sx == tx && sy <= ty && (ty - sy) % sx == 0 || sy == ty && sx <= tx && (tx - sx) % sy == 0;
}