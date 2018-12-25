package Do_It_자료구조.Chap05_재귀알고리즘;
import Do_It_자료구조.Chap04_스택과_큐.Stack_;

public class 스택을_이용한_꼬리재귀_제거 {
    public static void recur(int n){
        Stack_ stack = new Stack_(n);;
        boolean flag=false;
       // int n2;
        while(true){
            if(n>0){
                stack.push(n);
                n-=1;
                continue;
            }
            else{
                flag=true;
            }
            if((!stack.isEmpty())&&flag){
                n=stack.pop();
                System.out.println(n);
                n-=2;
                continue;
            }
            break;
        }
    }

    public static void main(String [] arg){
        recur(4);
    }
}
