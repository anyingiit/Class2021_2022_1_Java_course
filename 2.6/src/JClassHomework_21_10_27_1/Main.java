package JClassHomework_21_10_27_1;

// 冒泡排序
// 正序

public class Main {
    public static void main(String[] args){
        System.out.println("开始排序, 冒泡排序, 正序");
        int[] targetArray = {4, 9, 2, 3, 8, 1, 4, 5, 6, 0};
        System.out.print("原始数据: " + '\t');
        for (int item :
                targetArray) {
            System.out.print(Integer.toString(item) + '\t');
        }
        System.out.println();
        for (int i = 0; i < targetArray.length; i++){
            for (int j = 0; j < targetArray.length - i - 1; j++){
                if (targetArray[j + 1] < targetArray[j]){
                    int temp = targetArray[j];
                    targetArray[j] = targetArray[j + 1];
                    targetArray[j + 1] = temp;
                }
            }
        }
        System.out.print("排序后顺序: " + '\t');
        for (int item :
                targetArray) {
            System.out.print(Integer.toString(item) + '\t');
        }
    }
}
