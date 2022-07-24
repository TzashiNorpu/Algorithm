package algo.tzashinorpu.WeekContest.D220724;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class FoodRatings_6126 {
    Map<String, String> nameToCuisines;
    Map<String, Integer> nameToRating;
    Map<String, TreeMap<Integer, PriorityQueue<String>>> map;

    public FoodRatings_6126(String[] foods, String[] cuisines, int[] ratings) {
        this.nameToCuisines = new HashMap<>();
        this.nameToRating = new HashMap<>();
        this.map = new HashMap<>();
        int n = foods.length;
        for (int i = 0; i < n; i++) {
            String name = foods[i];
            String cuisine = cuisines[i];
            nameToCuisines.put(name, cuisine);
            int rating = ratings[i];
            nameToRating.put(name, rating);
            this.map.putIfAbsent(cuisine, new TreeMap<>((a, b) -> {
                return b - a;
            }));
            this.map.get(cuisine).putIfAbsent(rating, new PriorityQueue<>((a, b) -> b.compareTo(a)));
            this.map.get(cuisine).get(rating).add(name);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = this.nameToCuisines.get(food);
        Integer oldRating = this.nameToRating.get(food);
        this.map.get(cuisine).get(oldRating).remove(food);
        if (this.map.get(cuisine).get(oldRating).size() == 0) this.map.get(cuisine).remove(oldRating);
        //if (this.map.get(cuisine).size() == 0) this.map.remove(cuisine);
        this.map.get(cuisine).putIfAbsent(newRating, new PriorityQueue<>((a, b) -> b.compareTo(a)));
        this.map.get(cuisine).get(newRating).add(food);
        this.nameToRating.put(food, newRating);
    }

    public String highestRated(String cuisine) {
        return this.map.get(cuisine).firstEntry().getValue().peek();
    }
}
