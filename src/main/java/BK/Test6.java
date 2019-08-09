package BK;

/**
 * Author:Sophie
 * Created: 2019/8/9
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 一天，小明买了许多积木回家，他想把这些积木拼接在一起。每块积木有两个接口，每个接口我们用
 * 一个数字标记，规定只有当两块积木有相同数字标记的接口时，这两块积木才可以通过该接口拼接在一起。
 * 举例，有两块积木，接口数字分别为 1，2 和 3，4，那么这两块积木无法拼接；若两块积木接口数字分别
 * 为 1，2 和 2，3，那么这两块积木可以通过由数字 2 标记的接口拼接在一起。现在小明知道所有积木的数
 * 量和每块积木接口的数字标记，你能告诉他他可以将所有积木拼接成一个整体么？
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int zs=in.nextInt();
        while (zs>0){
            int count=in.nextInt()*2;
            int count1=count/2;
            Map<Integer,Integer> map=new HashMap<>();
            while (count>0){
                int temp=in.nextInt();
                if (map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                }else {
                    map.put(temp,1);
                }
                count--;
            }
            System.out.println(getResult(map,count1));
            zs--;
            map.clear();
        }
    }

    private static String getResult(Map<Integer, Integer> map, int count) {
        int temp=0;
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            if (m.getValue()>=2){
                temp+=m.getValue()/2;
            }
        }
        if (temp==count-1){
            return "YES";
        }else {
            return "NO";
        }
    }
}
