package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cherryPickup_1463Test {

    @Test
    void cherryPickup() {
        cherryPickup_1463 ins = new cherryPickup_1463();
        int[][] grid = {
                {1, 0, 0, 3},
                {0, 0, 0, 3},
                {0, 0, 3, 3},
                {9, 0, 3, 3}
        };
        System.out.println(ins.cherryPickup(grid));
    }
}