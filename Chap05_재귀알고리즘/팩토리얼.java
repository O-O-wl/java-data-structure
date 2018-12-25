package Do_It_자료구조.Chap05_재귀알고리즘;

public class 팩토리얼 {

    public static int factorial(int i){
        if(i==1){
            return 1;
        }
        return i*factorial((i-1));
    }


    public static void main(String arg[]){
        System.out.println(factorial(10));
    }
}
