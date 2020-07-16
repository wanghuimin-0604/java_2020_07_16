package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=4;
        array(arr,n);
    }

    private static void array(int[][] arr,int n){
        //创建一个一维数组来保存遍历出来的数据
        List<Integer> list=new ArrayList<>();
        for(int y= 0; y<arr.length;y++){
            int i = 0;
            int j = arr.length-1-y;
            for(int x = j;x < arr.length;i++,x++){
                list.add(arr[i][x]);
                //System.out.print(arr[i][x]+" ");
            }
            //System.out.println();
        }
        for(int i = 1; i < arr.length; i++){
            int x = 0;
            int y = i;
            for(int j = i;j < arr.length;j++,x++){
                list.add(arr[j][x]);
                //System.out.print(arr[j][x]+" ");
            }
            //System.out.println();
            //将集合转化为数组
        }
        for(int x:list){
            System.out.println(x+" ");
        }

    }

}
