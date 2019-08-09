package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

import java.util.Scanner;

/**
 * 小 A 设计了一种新的加密技术，可以采用一种聪明的办法在一个字符串中的字符之间插入随机字符串，从
 * 而对信息进行编码。出于保密考虑，关于如何在原有信息中产生和插入字符串的方式不会详细阐述。但为
 * 了验证方法的有效性，需要编写一个程序来验证原来的信息是否全在编码后的字符串中。给定两个字符串
 * s 和 t，需要判断 s 是否是 t 的“子序列”。即如果去掉 t 中的某些字符，剩下字符可以连接构成字符串 s。
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextLine()){
            String str=in.nextLine();
            String[] arr=str.split(" ");
            System.out.println(isSon(arr[0],arr[1]));

        }
    }

    private static String isSon(String son, String parent) {
        char[] charson = son.toCharArray();
        char[] charparent = parent.toCharArray();
        int sonlen=charson.length;
        int parentlen=charparent.length;
        if (sonlen>parentlen){
            return "NO";
        }
        if (son.equals(parent) || parent.contains(son)){
            return "YES";
        }
        int i = 0, j = 0;
        for (i = 0, j = 0; i < charson.length && j < charparent.length; ) {
            if (charson[i] == charparent[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == charson.length) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
