package 进制转转;

import java.util.Scanner;
//并输出1的个数
public class 十到二 {
    //取余
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while (num>0){
            if(num%2==1)count++;
            num/=2;
        }
        System.out.println(count);

    }
    import java.util.Scanner;

    public class Main {*/
    //直接转化成二进制数
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int num=sc.nextInt();
            int count = 0;

            String s=Integer.toBinaryString(num);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);

        }


    }



