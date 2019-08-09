package BK;

import java.util.Scanner;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

/**
 * 问题描述：
 * 小 B 正处于百无聊赖中，提不起干活的兴趣。看到桌面上的一条带着方格纸带，于是随手拿起一支笔，在
 * 纸带的每个方格中写上一个随机想起的数字。然后把纸带折起来撕成两半，她突然发现两半中各个数值加
 * 起来的和竟然是一样的。小 B 一下子有了一点精神，她想知道可以有多少种方式把纸带撕成两半，仍然使
 * 得两边的数值之和是相等的。你能帮她吗？
 * 输入描述：
 * 测试数据有多组，每组测试数据的第一行为一个整数 n（1=< n <=100000），为纸带上的方格数，第二
 * 行为 n 个空格分隔的数值，为小 B 写入方格的数值，所有的数都是绝对值不超过 10000 的整数。
 * 输出描述：
 * 对每组测试数据，在单独的行中输出不同撕法的总数，使得两边纸带中的数值之和相等。将纸带撕成两半
 * 时，只能沿方格的边缘撕开。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        int[] arr=new int[count];
        int sum=0;
        for (int i=0;i<count;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        int result=0;
        for (int i=0;i<count-1;i++){
            if (getSumLeft(arr,i)==getSumRight(arr,i)){
                result++;
            }
        }
        System.out.println(result);
    }

    //撕开之后右边的值的和
    private static int getSumRight(int[] arr, int i) {
        int sum=0;
        for (int j=i+1;j<arr.length;j++){
            sum+=arr[j];
        }
        return sum;
    }

    //撕开之后左边的值的和
    private static int getSumLeft(int[] arr, int i) {
        int sum=0;
        for (int j=0;j<=i;j++){
            sum+=arr[j];
        }
        return sum;
    }
}
