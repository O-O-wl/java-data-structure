package Do_It_자료구조.Chap06_정렬;

public class 병합정렬 {

    public static void main(String p[]){
        int arr[]= {1,2,7,3,4,5,6};
        merge(arr);
        for (int i = 0 ; i<arr.length ; i++){
            System.out.printf("array[%d]:%d\n",i,arr[i]);
        }
    }

    public static void merge(int arr_C[]){

        int pa = 0;
        int pb = 0;
        int pc = 0;

        int arr_A[] = new int[arr_C.length/2];
        for(int i = 0; i<arr_A.length;i++){
            arr_A[i] = arr_C[i];
            System.out.printf("array_A[%d]:%d\n",i,arr_A[i]);
        }

        int arr_B[] = new int[arr_C.length -arr_C.length/2];
        System.out.println(arr_B.length);
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
}
