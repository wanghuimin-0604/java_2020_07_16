package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-16
 * Time:10:50
 * 一万年太久，只争朝夕，加油
 */
import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int i = 0;//左指针
            int j = str.length()-1;//右指针
            int flag = 0;
            while(i<=j){
                if(str.charAt(i)!=str.charAt(j)){
                    if(str.charAt(i)==str.charAt(j-1)&&i<=j-1){
                        flag++;
                        j--;
                    }else if(str.charAt(i+1)==str.charAt(j)&&i+1<=j){
                        flag++;
                        i++;
                    }else{
                        flag = flag+2;
                        break;
                    }
                }else{
                    i++;
                    j--;
                }
            }
            if(flag<2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
