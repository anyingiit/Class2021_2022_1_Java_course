package JClassHomework_21_10_27_8;

/**
 * 快速排序, 正序
 * 使用存储pivot值的方法进行排序
 * @author AnYing
 * @Tile 2021-10-29 01:50:43
 */
public class QuickSort1 {
    /**
     * 对外公开的排序方法
     * @param sourceArray 目标数组
     */
    public static void sort(int[] sourceArray){
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }
    private static void quickSort(int[] array, int left, int right){
        if (left > right){
            return;
        }
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i != j){
            while (array[j] >= pivot && i != j){
                j--;
            }
            array[i] = array[j];
            while (array[i] <= pivot && i != j){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
}
