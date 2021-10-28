package JClassHomework_21_10_27_8;

public class QuickSort1 {
    QuickSort1(int[] sourceArray){
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }
    private void quickSort(int[] array, int left, int right){
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
    private void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
