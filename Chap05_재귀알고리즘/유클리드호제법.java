package Do_It_자료구조.Chap05_재귀알고리즘;

import java.util.Scanner;

public class 유클리드호제법 {
    //두정수의 최대 공약수 구하는 방법

    public static int 유클리드호제법(int n1,int n2){
      if(n2==0){return n1;}
      else{
      return 유클리드호제법(n2,n1%n2);}

    }

    /*
    *   n1 와 n2 로 변을 이루는 직사각형을 만든다
    *   둘중 작은 수로 된 정사각형으로 나눠낸후 남은 직사각형에 대해
    *   위의 과정을 반복한다
    */
    public static void main(String arg[]){
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("최대공약수를 구할 두개의 정수를 입력해주세요");
        n1=scanner.nextInt();
        n2=scanner.nextInt();

        System.out.println("최대공약수는 :"+유클리드호제법(n1,n2));


    }
}
