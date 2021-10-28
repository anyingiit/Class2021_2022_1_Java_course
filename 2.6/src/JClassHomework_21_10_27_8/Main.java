package JClassHomework_21_10_27_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> targetArray = new ArrayList<Integer>();
        int[] targetArray = new int[50000];
        Random random = new Random(1000);
        for (int i = 0; i < 50000; i++){
            targetArray[i] = random.nextInt(100000);
        }
//        QuickSort.sort(targetArray.toArray(new int[targetArray.size()]));
//        targetArray.stream()
        QuickSort.sort(targetArray);
        for (int i = 1; i <= targetArray.length; i++){
            System.out.print(Integer.toString(targetArray[i - 1]) + '\t');
            if (i % 5 == 0) System.out.println();
        }
        if (checkSort(targetArray)){
            System.out.println("恭喜, 所有数据检查成功!");
        }else {
            System.out.println("有数据检查失败...");
        }
    }
    public static boolean checkSort(int[] sourceArray){
        for (int i = 0; i < sourceArray.length - 1; i++){
            if (!(sourceArray[i + 1] >= sourceArray[i])){
                System.out.format("检查出错误, 当前下标为: [%d], 当前数字为: %d, 下一个数字为: %d\n", i, sourceArray[i], sourceArray[i + 1]);
                return false;
            }
        }
        return true;
    }
}
