package Do_It_자료구조.Chap06_정렬;

import java.util.Scanner;

public class 셸정렬 {
    /*
     단순 삽입 정렬의 장점을 살리고 단점을 보완한 알고리즘
     4-정렬
     2-정렬
     1-정렬
     n-정렬은 n칸이 떨어진 배열요소를 그룹화 하여 정렬
     n정렬로 최대한 정렬을수행한후 마지막에 단순 삽입 정렬 시행
      */


    static void ShellSort(int arr[] , int n) {

        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h ; i < n; i++) {
                int j;
                int tmp = arr[i];
                for (j = i - h; j >= 0 && arr[j] > tmp; j -= h)
                    arr[j+h]=arr[j];

                arr[j+h]=tmp;


            }


    }
    public static void main(String arp[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("셸 정렬 ");
        System.out.println("요소수: ");
        int arraySize = scanner.nextInt();
        int arr[] = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=scanner.nextInt();

        }

        ShellSort(arr,arraySize);

        System.out.println("오름차순 정렬");

        for(int i=0;i<arraySize;i++){
            System.out.println("arr["+i+"] : "+arr[i]);


        }

    }
}
