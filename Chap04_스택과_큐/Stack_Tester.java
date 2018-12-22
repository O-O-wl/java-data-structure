package Do_It_자료구조.Chap04_스택과_큐;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Stack_Tester {


    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);

        Stack_ stack = new Stack_(64);

        int menu=-1;

        while(menu!=0){
            System.out.println("현재데이터수 : "+ stack.size()+ "/"+stack.capacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 :");
            menu=scanner.nextInt();

            switch (menu){

                case 1:
                    System.out.print("데이터 :");
                    stack.push(scanner.nextInt());
                    break;

                case 2:
                    stack.pop();
                    break;
                case 3 :
                    stack.peek();
                    break;
                case 4 :
                    stack.dump();
                    break;

            }


        }



    }
}
