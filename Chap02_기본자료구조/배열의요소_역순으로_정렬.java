package Do_It_자료구조.Chap02_기본자료구조;



public class 배열의요소_역순으로_정렬 {



    public static void main(String[] arg){

    int arr[]= new int[10];
    기본메소드.putData(arr);
    기본메소드.printArr(arr);

    reverse(arr);
    System.out.println("\n정렬");
    기본메소드.printArr(arr);

    }

    public static void reverse(int arr[]){

        int temp;
        for(int i =0;i<arr.length/2 ;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }


    }








}
