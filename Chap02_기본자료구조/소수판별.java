package Do_It_자료구조.Chap02_기본자료구조;

public class 소수판별 {

    public static void main(String arg[]){




    }

    public static void findSosu(int end){

        for(int i=1;i<=end;i++){
            for(int j=1;j<=i;j++){
                if(i%j!=0){break;}
                if(i==j){
                    System.out.println(i);
                }
            }
        }

    }
}
