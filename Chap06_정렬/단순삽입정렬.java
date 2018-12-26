package Do_It_자료구조.Chap06_정렬;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class 단순삽입정렬 {
    //선택한 요소를 그보다 더 앞쪽 알맞은 위치에 삽입하여 정렬하는 알고리즘
    // 셔틀정렬 

    static void insertoinSort(int arr[] , int n){
        for(int i=1 ;i <n;i++){
            int j;
            int tmp=arr[i];
            for(j=i;j>0&&arr[j-1]>tmp ;j--) {
                arr[j] = arr[j - 1];
            }
                arr[j]=tmp;


        }

    }




    public static void main(String arp[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("단순 삽입정렬");
        System.out.println("요소수: ");
        int arraySize = scanner.nextInt();
        int arr[] = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=scanner.nextInt();

        }

        insertoinSort(arr,arraySize);

        System.out.println("오름차순 정렬");

        for(int i=0;i<arraySize;i++){
            System.out.println("arr["+i+"] : "+arr[i]);


        }

    }
}
