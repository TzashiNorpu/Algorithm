package algo.tzashinorpu.test;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int k=2;
        int[] res=new int[k];
        //quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            partition(arr, i, 0, arr.length - 1);
        }
        for(int i =0;i<k;k++){
            res[i]=arr[i];
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int startIndex, int endIndex) {
        // terminator
        if (startIndex >= endIndex) return;
        // posIndex: 界限索引位置：该索引左边的元素都小于该索引位置的元素，该索引右边的元素都大于该索引位置的元素
        // posIndex:拿到 [startIndex,endIndex] 索引之间元素的界限索引位置
        int posIndex = partition(arr, startIndex, startIndex, endIndex);
        System.out.println("-----" + posIndex);
        quickSort(arr, startIndex, posIndex - 1);
        quickSort(arr, posIndex+1, endIndex);
    }
    // 选择 pivotIndex 的元素作为比较元素，从两端收缩，最后返回 所有比比较元素小的元素都在 pivotIndex 左侧，
    // 所有比比较元素大的元素都在 pivotIndex 右侧的数组，返回的 值是这个比较元素最后所处位置的索引
    private static int partition(int[] arr, int pivotIndex, int startIndex, int endIndex) {
        // index 是元素用于交换位置的中间索引
        int index = pivotIndex;
        // when pivotIndex <> startIndex ???
        int pivot = arr[pivotIndex];

        int left = startIndex;
        int right = endIndex;

        while (left < right) {
            // right 指针从右往左找比 pivot 小的元素
            while (left < right && arr[right] > pivot) {
                right--;
            }
            // while 循环退出：找到比 pivot 小的元素后交换位置，更新下次可以放值索引
            arr[index] = arr[right];
            index = right;

            //left 指针从左往右找比 pivot 大的元素
            // <= 处理 duplicate element，上面已经处理了 右边元素 <= pivot 时进行左移
            // <= 处理左边元素只有在大于 pivot 时右移，不然  = pivot 的元素右移导致无限循环
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[index] = arr[left];
            index = left;
        }
        arr[left] = pivot;
        return left;
    }

}
