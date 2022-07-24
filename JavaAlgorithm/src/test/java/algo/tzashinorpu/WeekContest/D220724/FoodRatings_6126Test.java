package algo.tzashinorpu.WeekContest.D220724;

import org.junit.jupiter.api.Test;

class FoodRatings_6126Test {

    @Test
    void changeRating() {
       
        FoodRatings_6126 ins = new FoodRatings_6126(
                new String[]{"emgqdbo", "jmvfxjohq", "qnvseohnoe", "yhptazyko", "ocqmvmwjq"},
                new String[]{"snaxol", "snaxol", "snaxol", "fajbervsj", "fajbervsj"},
                new int[]{2, 6, 18, 6, 5}
        );
        ins.changeRating("qnvseohnoe", 11);
        System.out.println(ins.highestRated("fajbervsj"));
        ins.changeRating("emgqdbo", 3);
        ins.changeRating("jmvfxjohq", 9);
        ins.changeRating("emgqdbo", 14);
        System.out.println(ins.highestRated("fajbervsj"));
        System.out.println(ins.highestRated("snaxol"));
    }
}