package Do_It_자료구조.Chap02_기본자료구조;

import java.util.Random;

public class 기본메소드 {

    public static void putData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(190);

        }
    }

    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+",");

    }
}}
