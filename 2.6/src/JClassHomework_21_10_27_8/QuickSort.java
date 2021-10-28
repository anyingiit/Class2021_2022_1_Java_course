package JClassHomework_21_10_27_8;

/**
* 快速排序, 正序
* 使用存储pivot指针的方法进行排序
* @author AnYing
* @Tile 2021-10-29 01:43:08
*/
public class QuickSort {
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
        int pivotIndex = left;
        int i = left;
        int j = right;
        while (i != j){
            while (array[j] >= array[pivotIndex] && i != j){
                j--;
            }
            while (array[i] <= array[pivotIndex] && i != j){
                i++;
            }
            swap(array, i, j);
        }
        swap(array, i, pivotIndex);
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }
    private static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
