package Do_It_자료구조.Chap04_스택과_큐;
import com.sun.tools.internal.xjc.reader.Ring;

import java.sql.SQLOutput;
import java.util.Scanner;


public class RingBufferQueue_Tester {

        public static void main(String [] arg){
            Scanner scanner = new Scanner(System.in);

            RingBufferQueue queue = new RingBufferQueue(64);

            int menu=-1;

            while(menu!=0){
                System.out.println("현재데이터수 : "+ queue.size()+ "/"+queue.capacity());
                System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 :");
                menu=scanner.nextInt();
                switch (menu){

                    case 1:
                        System.out.print("데이터 :");
                        queue.enQueue(scanner.nextInt());
                        break;

                    case 2:
                        queue.deQueue();
                        break;
                    case 3 :
                        queue.peek();
                        break;
                    case 4 :
                        queue.dump();
                        break;

                }


            }



        }


}
