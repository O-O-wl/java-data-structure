package Do_It_자료구조.Chap06_정렬;

import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

public class 퀵정렬 {
    /*
    * 아주 빠른 정렬 알고리즘
    * 가운데 값을 피벗 기준점으로 두고
    * 배열 양 끝을  포인터1,2를 둔다
    * 왼쪽마커는 피벗보다 크거나 오른쪽 끝 일때 멈춤
    * 왼쪽마커가 맨 오른쪽에서 멈추는 것은 작업영역내에 피벗이 가장 큰 수라는 것을 의미
    * 오른쪽마커는 피벗보다 작거나, 왼쪽마커와 만날시 멈춤
    * 피벗을 향해 포인터가 움직이며 피벗크기에 맡게 정렬 */

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ====================================");
          System.out.print("| 정렬할 배열의 요소의 수를 입력해주세요:");
          int size = scanner.nextInt();
         // System.out.println("|");
        System.out.println(" ====================================");

        int arr[] = new int [size];
        for(int i = 0 ; i < size ; i ++ ){
            System.out.println(" ------------------------------------");
            System.out.print("| 배열["+i+"]의 값을 입력해주세요:");
            arr[i]= scanner.nextInt();
        //    System.out.println("|");
            System.out.println(" ------------------------------------");
        }

        quickSort2(arr,0,arr.length-1);

        for(int i = 0 ; i < arr.length;i++){
            System.out.println("배열["+i+"] = "+arr[i]);
        }

       // quickSort(arr,arr.length);

    }

    public static void swap(int arr[] , int a1,int a2){
        int temp = arr[a1]; arr[a1] = arr[a2]; arr[a2] = temp;
    }

    public static void quickSort(int arr[],int left , int right){
        int pl = left ;
        int pr  = right;
        int pivot = arr[(pl+pr)/2];


        System.out.printf("arr[%d]~arr[%d]: {",left,right);

        for (int i = left ; i < right ; i++){
            System.out.printf("%d ,",arr[i]);
        }
        System.out.println(arr[right]+"}");
      //  System.out.println();
        do{
            // 오른쪽 스캔
           // System.out.println("피벗:"+pivot);
            while(arr[pl] < pivot){pl++;}
            //    System.out.println("왼쪽마커:"+pl);pl++;}
            //왼쪽 스캔
            while (arr[pr] > pivot){
                //System.out.println("오른쪽마커:"+pr);
            pr--;}
            // 두 마커 스캔 멈췃을시 교차하지 않았으면 두 요소 교환
             if(pl<= pr){swap(arr,pl++,pr--);}

        }while(pl<=pr); // 교차전 까지 반복

        // 교차완료후 그룹 분할 후 재귀호출

        // 작업영역 시작과 반대방향 마커를 하나의 그룹으로 실행 요소1개가 넘을시 재귀호출
        if (left < pr)  quickSort(arr,left,pr);
        if (right > pl) quickSort(arr,pl,right);


     }



     // 비 재귀 퀵 정렬
     public static void quickSort2(int arr[],int left, int right){

         // 그룹크기에 해당하는 스택생성
         IntStack lStack = new IntStack(right - left + 1);
         IntStack rStack = new IntStack(right - left + 1);

         //각각의 시작인덱스 push
         lStack.push(left);
         rStack.push(right);

         while (lStack.empty() != true){
             int pl = left = lStack.pop();
             int pr = right = rStack.pop();

             int pivot = arr[(left+right)/2];

             do{
                 // 오른쪽 스캔
                 // System.out.println("피벗:"+pivot);
                 while(arr[pl] < pivot){pl++;}
                 //    System.out.println("왼쪽마커:"+pl);pl++;}
                 //왼쪽 스캔
                 while (arr[pr] > pivot){
                     //System.out.println("오른쪽마커:"+pr);
                     pr--;}
                 // 두 마커 스캔 멈췃을시 교차하지 않았으면 두 요소 교환
                 if(pl<= pr){swap(arr,pl++,pr--);}

             }while(pl<=pr);

             // 요소가 1개 이상이면 스택에 집어넣음 -- while문 반복실행됨
             if(pr > left){
                 lStack.push(left);
                 rStack.push(pr);
                 }
             if(pl< right){
                 lStack.push(pl);
                 rStack.push(right);}
         }

     }


}

