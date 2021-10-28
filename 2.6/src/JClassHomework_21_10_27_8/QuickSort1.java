package JClassHomework_21_10_27_8;

public class QuickSort1 {
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
