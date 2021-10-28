package JClassHomework_21_10_27_7;

// 快速排序
// 正序

public class Main {
    public static void main(String[] args) {
        int[] targetArray = {4, 9, 2, 3, 8, 1, 4, 5, 6, 0};
        quickSort(targetArray, 0, targetArray.length - 1);
        for (int item :
                targetArray) {
            System.out.println(item);
        }
    }
    public static void quickSort(int[] sourceArray, int leftIndex, int rightIndex){
        if(rightIndex - leftIndex <= 1){
            return;
        }
        int left = leftIndex;
        int right = rightIndex;
        int key = sourceArray[left];
        while (left < right){
            while (true){
                if (sourceArray[right] < key){
                    sourceArray[left] = sourceArray[right];
                    break;
                }else {
                    if (left < right){
                        right--;
                    }else {
                        break;
                    }
                }
            }
            while (true){
                if (sourceArray[left] > key){
                    sourceArray[right] = sourceArray[left];
                    break;
                }else {
                    if (left < right) {
                        left++;
                    }else {
                        break;
                    }
                }
            }
        }
        sourceArray[left] = key;
        quickSort(sourceArray, leftIndex, left - 1);
        quickSort(sourceArray, left + 1, rightIndex - 1);
    }
}
