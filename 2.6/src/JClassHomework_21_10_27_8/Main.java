package JClassHomework_21_10_27_8;

public class Main {
    public static void main(String[] args) {
        int[] targetArray = {4, 9, 2, 3, 8, 1, 4, 5, 6, 0};
        QuickSort quickSort = new QuickSort(targetArray);
        for (int item :
                targetArray) {
            System.out.print(Integer.toString(item) + '\t');
        }
    }
}
