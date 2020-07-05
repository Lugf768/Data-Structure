package com.lgf.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class BubbleSort {

    public static void main(String[] args) {
//        int arr[] = {3, 9, -1, 10, 20};
//        System.out.println("排序前的数组：" + Arrays.toString(arr));

        //测试冒泡排序的速度,时间
        int arr[] = new int[80000];
        for (int i = 0; i < 80000; i++){
            arr[i] = (int) (Math.random()*8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println(date1Str);

        bubbleSort(arr);

        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date2);
        System.out.println(date2Str);
    }
    public static void bubbleSort(int[] arr) {
        //第一趟排序，就是将最大的数放在最后面
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++){
            boolean flag = false; //表示变量,表示是否进行过交换
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
