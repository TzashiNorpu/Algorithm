//
// Created by TzashiNorpu on 2023/6/8.
//
#include "../header/header.h"

using namespace zero;

int
Solution::minNumberOfHours(int initialEnergy, int initialExperience, vector<int> &energy, vector<int> &experience) {
  /*int sum_energy = std::accumulate(energy.begin(), energy.end(), 0);
  int need_energy = 0;
  if (initialEnergy < sum_energy)
    need_energy = sum_energy + 1 - initialEnergy;
  int need_exp = 0;
  for (auto exp: experience) {
    if (exp >= initialEnergy) need_exp = exp + 1 - initialEnergy;
    initialExperience += exp;
  }
  return need_energy + need_exp;*/
  int n = energy.size();
  int sum_energy = 0;
  int need_exp = 0;
  for (int i = 0; i < n; ++i) {
    sum_energy += energy[i];
    if (experience[i] >= initialExperience) {
      need_exp += (experience[i] + 1 - initialExperience);
      initialExperience = experience[i] + 1;
    }
    initialExperience += experience[i];
  }
  return (initialEnergy < sum_energy + 1 ? sum_energy + 1 - initialEnergy : 0) + need_exp;

}