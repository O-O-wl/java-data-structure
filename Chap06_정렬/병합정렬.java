package Do_It_자료구조.Chap06_정렬;

import javax.print.attribute.standard.Finishings;

public class 병합정렬 {

    public static void main(String p[]){
        int arr[]= {1,2, 7,3, 4,5, 6,9};
        merge(arr);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.printf("array[%d]:%d\n",i,arr[i]);
        }
    }

    public static void merge_temp(int arr_C[]){

        int pa = 0;
        int pb = 0;
        int pc = 0;

        int arr_A[] = new int[arr_C.length/2];
        for(int i = 0; i<arr_A.length;i++){
            arr_A[i] = arr_C[i];
            System.out.printf("array_A[%d]:%d\n",i,arr_A[i]);
        }


        int arr_B[] = new int[arr_C.length -arr_C.length/2];
       // System.out.println(arr_B.length);
        for(int i = 0; i<arr_B.length;i++){
            arr_B[i] = arr_C[i+arr_C.length -arr_C.length/2-1];
            System.out.printf("array_B[%d]:%d\n",i,arr_B[i]);
        }


        while (pa < arr_A.length && pb < arr_B.length){
           arr_C[pc++] = arr_A[pa] <= arr_B[pb]?arr_A[pa++]:arr_B[pb++];
        }
        while (pa < arr_A.length){arr_C[pc++]= arr_A[pa++];}
        while (pb < arr_B.length){arr_C[pc++]= arr_B[pb++];}



    }

    // 임시 저장 배열
    static int buff[] ;
    public static void nestedMerge(int a[],int left,int right){



        // 요소가 한개될때 까지
        if(left < right) {


            int arrIterator = 0;    // 어레이를 탐색하며 저장 버퍼에
            int firstGroup = 0;     // 실제적으로 버퍼에 저장된 앞배열 수
            int secondGroup = 0 ;   // 실제적 뒷배열수
            int center = (right + left) / 2;
            int finish = left;


            nestedMerge(a, left, center);
            nestedMerge(a, center + 1, right);

            // buff에 앞 배열 복사
            // i 는 buff 에 저장된 앞배열요소수
           for(arrIterator = left ; arrIterator <= center; arrIterator++){
             buff[firstGroup++] = a[arrIterator];
           }



           // 뒷배열에 원본배열에 앞배열복사본 뒷배열
           while( arrIterator <= right && secondGroup < firstGroup ) {
               // 원본배열 첫요소에 앞배열 복사본과 뒷배열 처음부분 비교후 대입
               a[finish++] = (buff[secondGroup]<= a[arrIterator])? buff[secondGroup++]:a[arrIterator++];

           }

           // 마지막요소 이면서 첫 그룹이 더 클떄 buff의 마지막 수 원본에 대입
           while (secondGroup < firstGroup){
               a[finish++]  = buff[secondGroup++];
           }
        }
    }

    public static void merge(int a[]){


        buff = new int[a.length];
        nestedMerge(a,0,a.length-1);

        buff = null;

    }
}
