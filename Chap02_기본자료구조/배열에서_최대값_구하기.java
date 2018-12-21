package Do_It_자료구조.Chap02_기본자료구조;

public class 배열에서_최대값_구하기 {

    public static void main(String [] arg){



    }


    public int maxOfArray(int [] arr){
        int max=arr[0];
        for(int i =0 ; i<arr.length;i++){
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
}
