package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

/**
 * 在一次生日派对中，有 n 个孩子参加了派对，他们决定相互赠送礼物。他们赠送礼物的方式是：首先将每
 * 个人的名字写在一张纸条上，然后放入一个不透明的盒子内，接下来每个孩子都会从盒子中随机拿走一张
 * 纸条，这样最后每个孩子都会拿到一张纸条。然后每一个孩子会给自己拿到的纸条上对应的那个人送礼物。
 * 但是这个方式有一个问题，就是有些孩子可能会拿到写着自己名字的纸条，那么他们就会不开心。现在你
 * 需要计算一下会出现这种情况的概率是多少，即至少有一个孩子拿到写着自己名字的纸条的概率。
 */

import java.util.Scanner;

/**
 * 也就是  1-没有人拿到自己的纸条的概率
 * N个人抽不到自己名字的概率=
 *  N-1/N *  N-1个人抽不到自己名字的概率
 * + N-2个人抽不到自己名字的概率/N
 */
public class Test5 {
    public static void main(String[] args) {
        double[] p=new double[1000005];
        p[1]=0;
        p[2]=0.5;
        for (int i=3;i<=1000000;i++){
            p[i]=p[i-1]*(i-1)/i+p[i-2]/i;
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.printf("%.2f",1-p[n]);

    }
}
