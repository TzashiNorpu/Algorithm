package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Arrays;

public class carFleet_853 {
    //    如果车 x 排在 车 y 前面，且 x 到达终点所需时间比 y 少，则 x 必然会被 y 卡住，形成车队。
    public int carFleet(int target, int[] pos, int[] speed) {
        int N = pos.length, res = 0;
        double[][] cars = new double[N][2];
        for (int i = 0; i < N; ++i)
            cars[i] = new double[]{pos[i], (double) (target - pos[i]) / speed[i]};
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        double cur = 0;
        /*
            [0.0,12.0]
            [3.0,3.0]
        x-> [5.0,7.0]
        y-> [8.0,1.0]
            [10.0,1.0]
         */
        for (int i = N - 1; i >= 0; --i) {
            if (cars[i][1] > cur) {
                cur = cars[i][1];
                res++;
            }
        }
        return res;
    }
}
