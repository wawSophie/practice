package BK;

import java.util.Scanner;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

/**
 * 小明同学刚刚学习打字，现在老师叫他输入一个英文字符串。小明发现，这个英文字符串只由大写和小写
 * 的英文字母构成。小明同学只会使用 Caps Lock 键来切换大小写输入。最开始，大写锁定处于关闭状态，
 * 小明的电脑只能输入小写英文字母。当大写锁定关闭时，按一下 Caps Lock 键可以打开大写锁定，之后只
 * 能输入大写字母；当大写锁定打开时，按一下 Caps Lock 键可以关闭大写锁定，之后只能输入小写字母。
 * 现在小明想知道输入这个字符串最少需要按键多少次。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] arr=str.toCharArray();
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            if (Math.abs(arr[i]-arr[i+1])>=32){
                count++;
            }
        }
        count+=arr.length;
        System.out.println(count);
    }
}
