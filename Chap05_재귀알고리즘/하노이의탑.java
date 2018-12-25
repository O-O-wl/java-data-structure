package Do_It_자료구조.Chap05_재귀알고리즘;

import java.util.Scanner;

public class 하노이의탑 {

    public static void move(int no,int  start , int target,int max){

        if(no>1) {
            move(no - 1, start, max - start - target, max);

            }
        System.out.println("원반 [" + no + "] 을 " + start + "기둥에서 " + target + "기둥으로 옮깁니다.");

        if(no>1){
            move(no-1,max-start-target,target,max);
        }

    }

    public static void main(String []arg){
        Scanner scanner = new Scanner(System.in);
        move(5,1,6,21);
    }
}
