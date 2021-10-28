package JClassHomework_21_10_27_8;

public class QuickSort {
    QuickSort(int[] sourceArray){
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }
    private void quickSort(int[] array, int left, int right){
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
    private void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
