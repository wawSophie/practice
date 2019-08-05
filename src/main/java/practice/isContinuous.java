package practice;

/**
 * Author:Sophie
 * Created: 2019/8/5
 */
public class isContinuous {

    public static void main(String[] args) {
        int[] numbers=new int[]{0,2,4,6,8};
        System.out.println(isContinuous(numbers));
    }
        //首先牌数得是5，否则false
        //顺子的特点，最大值减去最小值为4，并且牌不重复，但是由于有大小为0的存在，最大值减去最小值<=4，
        //大小王的个数，也就是0的个数<=4，判断其他牌个数不大于2，保证不会出现对子

        public static boolean isContinuous(int [] numbers) {
            int len=numbers.length;
            if(len!=5){
                return false;
            }
            int max=-1;
            int min=14;
            int[] num=new int[14];
            for(int i=0;i<5;i++){
                num[numbers[i]]++;

                //非0的牌数大于1，即出现对子了，返回false
                if(num[numbers[i]]>1 && numbers[i]!=0){
                    return false;
                }

                if(numbers[i]>max){
                    max=numbers[i];
                }
                if(numbers[i]<min && numbers[i]!=0){
                    min=numbers[i];
                }

                //大小王的个数<=4
                if(num[0]>4){
                    return false;
                }
                //最大值减去最小值>4，则即使有大小为来填补，也填补不了
                if(max-min>4){
                    return false;
                }
            }
            return true;
        }

}
