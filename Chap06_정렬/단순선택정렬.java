package Do_It_자료구조.Chap06_정렬;

public class 단순선택정렬 {

    // 가장 작은 요소부터 선택해 알맞은 위치로 옮겨 순서대로 정렬하는
    // 알고리즘

    public static void staightSelectionSort(int arr [],int n){

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(arr[j]<arr[min])
                    min=j;



        }

        }



    public static void main(String arg[]){
        int[]arr = {1,2,3,4,23,9,11,100};
        staightSelectionSort(arr,8);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
