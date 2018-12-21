package Do_It_자료구조.Chap02_기본자료구조;

import java.util.Arrays;
import java.util.Random;

public class 배열에서_최대값_구하기 {

    public static void main(String [] arg){

        int arr[] = new int[10];

        기본메소드.putData(arr);

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("최대값:" +maxOfArray(arr));





    }

    public static int maxOfArray(int [] arr){
        int max=arr[0];
        for(int i =0 ; i<arr.length;i++){
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
}
