package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cherryPickup_1463Test {

    @Test
    void cherryPickup() {
        cherryPickup_1463 ins = new cherryPickup_1463();
        int[][] grid = {
                {3, 1, 1},
                {2, 5, 1},
                {1, 5, 5},
                {2, 1, 1}
        };
        System.out.println(ins.cherryPickup(grid));
    }
}