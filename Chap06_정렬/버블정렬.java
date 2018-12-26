package Do_It_자료구조.Chap06_정렬;

public class 버블정렬 {
    // 인접한 두요소를 정렬
    public static void bubbleSort(int[]arr,int count){
        for(int i=0;i<arr.length-1;i++){
            int temp;
            count++;
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=0;
                continue;
            }
        }
        System.out.println(count);
    }


    public static void main(String arg[]){
        int[]arr = {1,2,3,4,23,9,11,100};
        bubbleSort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
