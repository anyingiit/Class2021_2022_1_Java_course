package JClassHomework_21_10_27_5;

// 有一列乱序的字符，‘a’,‘c’,‘u’,‘b’,‘e’,‘p’,‘f’,‘z’，排序并按照英文字母表的逆序输出输出姓名，学号。

public class Main {
    public static void main(String[] args) {
        char[] source = {'a','c','u','b','e','p','f','z'};
        System.out.print("原始数据: " + '\t');
        for (char item :
                source) {
            System.out.print(item);
            System.out.print('\t');
        }
        System.out.println();
        for (int i = 0; i < source.length; i++){
            for (int j = 0; j < source.length - i - 1; j++){
                if (source[j + 1] < source[j]){
                    char temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
        System.out.print("排序后顺序: " + '\t');
        for (char item :
                source) {
            System.out.print(item);
            System.out.print('\t');
        }
    }
}