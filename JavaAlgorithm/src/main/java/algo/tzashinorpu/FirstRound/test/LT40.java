package algo.tzashinorpu.FirstRound.test;

public class LT40 {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int k = 2;
        int a =1;
        switch (a) {
            case 1:
                System.out.println("11111");
            default:
                System.out.println("default");
                break;
            case 2:
                System.out.println("22222");

        }
        int[] res = getLeastNumbers(arr, k);
        for (int i :
                res) {
            System.out.println(i);
        }

    }

    static int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=arr[i];
        }
        return res;
    }
}




