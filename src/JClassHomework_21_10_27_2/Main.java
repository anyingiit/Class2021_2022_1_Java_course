package JClassHomework_21_10_27_2;

// 选择排序
// 正序

public class Main {
    public static void main(String[] args){
        System.out.println("开始排序, 选择排序, 正序");
        int[] targetArray = {4, 9, 2, 3, 8, 1, 4, 5, 6, 0};
        System.out.print("原始数据: " + '\t');
        for (int item :
                targetArray) {
            System.out.print(Integer.toString(item) + '\t');
        }
        System.out.println();
        for (int i = 0; i < targetArray.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < targetArray.length; j++){
                if (targetArray[j] < targetArray[minIndex]){
                    minIndex = j;
                }
            }
            int temp = targetArray[i];
            targetArray[i] = targetArray[minIndex];
            targetArray[minIndex] = temp;
        }
        System.out.print("排序后顺序: " + '\t');
        for (int item :
                targetArray) {
            System.out.print(Integer.toString(item) + '\t');
        }
    }
}
