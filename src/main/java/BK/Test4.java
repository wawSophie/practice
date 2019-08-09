package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

import java.util.Scanner;

/**
 * 人民币有很多不同面值的纸币，在本题中，只考虑以下 7 种面值的纸币，它们分别为：1 元、2 元、5 元、
 * 10 元、20 元、50 元、100 元。你知道凑出 n 元最少需要多少张纸币吗？
 */
public class Test4 {
    static int[] money=new int[]{100,50,20,10,5,2,1};
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        while (count>0){
            int tempmoney=in.nextInt();
            System.out.println(needMany(tempmoney));
            count--;
        }
    }

    private static int needMany(int tempmoney) {
        int count=0;
        for (int i=0;i<money.length;i++){
            while (tempmoney>=money[i]){
                tempmoney-=money[i];
                count++;
            }
        }
        return count;
    }
}
