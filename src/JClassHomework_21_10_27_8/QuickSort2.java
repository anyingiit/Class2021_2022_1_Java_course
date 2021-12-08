package JClassHomework_21_10_27_8;

/**
 * 使用单个扫描器的方法
 * @author AnYing
 * @Time 2021-10-29 08:24:21
 * */
public class QuickSort2 {
    /**
     * 对外公开方法
     * @param sourceArray 传入引用的数组
     * */
    public static void sort(int[] sourceArray){
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }
    /**
     * 内部处理函数, 包含partition过程以及递归的处理array[left ... j - 1]以及array[j + 1 ... right - 1]
    * */
    private static void quickSort(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        int l = left;// 定义pivot的位置, 既基准值的指针位置
        int j = left;// 循环不变量, 用于分界, 总是使得array[left ... j - 1] < array[l], array[j + 1, i) > array[l]
        int i = left + 1;// 指针, 指向当前待考察元素
        while (i <= right){
            while (array[i] >= array[l] && i <= right){
                i++;
            }
            swap(array, i, j + 1);
            j++;
        }
        swap(array, j, l);// 使基准值归为, 得array[left ... j - 1] < array[j], array[j + 1, right] > array[j]
        quickSort(array, left, j - 1);
        quickSort(array, j + 1, right - 1);
    }
    private static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
