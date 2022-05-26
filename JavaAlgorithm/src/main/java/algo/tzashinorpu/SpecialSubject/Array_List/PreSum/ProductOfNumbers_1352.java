package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.ArrayList;

public class ProductOfNumbers_1352 {
    public ProductOfNumbers_1352() {
        // 3,0,2,5,4
        // [0,0,40,20,4]
        // 1->2->10->40
    }

    ArrayList<Integer> A = new ArrayList() {{
        add(1);
    }};

    public void add(int num) {
        if (num > 0)
            A.add(A.get(A.size() - 1) * num);
        else {
            A = new ArrayList();
            A.add(1);
        }
    }

    public int getProduct(int k) {
        int n = A.size();
        return k < n ? A.get(n - 1) / A.get(n - k - 1) : 0;
    }
}
