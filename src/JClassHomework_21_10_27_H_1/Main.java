package JClassHomework_21_10_27_H_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("某同学 00000000000");
        int[] a = {5, 4, 2, 4, 9, 1};
        int[] useSort = a.clone();
        int[] useMyBubbleSort = a.clone();
        Arrays.sort(useSort);
        bubbleSort(useMyBubbleSort);
        System.out.println("原始数据: " + getArrayFormatString(a));
        System.out.println("使用Arrays.sort排序: " + getArrayFormatString(useSort));
        System.out.println("使用我的冒泡排序: " + getArrayFormatString(useMyBubbleSort));

    }
    public static void bubbleSort(int[] sourceArray){
        for (int i = 0; i < sourceArray.length; i++){
            for (int j = 0; j < sourceArray.length - i - 1; j++){
                if (sourceArray[j + 1] < sourceArray[j]){
                    int temp = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = temp;
                }
            }
        }
    }
    public static String getArrayFormatString(int[] sourceArray){
        StringBuilder result = new StringBuilder();
        for (int item :
                sourceArray) {
            result.append(Integer.toString(item)).append('\t');
        }
        return result.toString();
    }
}
