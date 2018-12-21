package Do_It_자료구조.Chap02_기본자료구조;

public class 배열_값으로_정렬 {

    public static void main(String[] arg){



    }


    public static void sortLess(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i=0;

                }
            }
        }
    }
}
