package Do_It_자료구조.Chap06_정렬;

public class 버블정렬2{
    public static void BubbleSort(int arr[], int count){
        int k=0;
        int temp;
        for(int i=arr.length-1;i>0;i--){
            for(int j=arr.length-1;j>k;j--){
                count++;
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    k++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String arg[]){
        int[]arr = {1,2,3,4,23,9,11,100};
        BubbleSort(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
