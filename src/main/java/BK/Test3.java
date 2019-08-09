package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

import java.util.Scanner;

/**
 * 对于一个非负整数我们称它是美丽的当且仅当它的十进制表示下不包含多个相同的数字。比如 1234，7523
 * 都是美丽的，但 99，121，3043 等都不是美丽的。现在给出一个数字n，你需要找到比n大的，最小的美
 * 丽的数。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
            while (true){
                num++;
                if (isML(num)){
                    break;
                }
            }

        System.out.println(num);
    }

    private static boolean isML(int num) {
        char[] chars=String.valueOf(num).toCharArray();
        for (int i=0;i<chars.length-1;i++){
            for (int j=i+1;j<chars.length;j++){
                if (chars[i]==chars[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
