package Do_It_자료구조.Chap04_스택과_큐;

public class RingBufferQueue {

        int [] queue;
        int front;
        int rear;
        int max;
        int num;




        
        public RingBufferQueue(int capacity){
           num=front=rear=0;
           max=capacity;
           queue=new int[capacity];


        }
        public void enQueue(int value){
            if(this.isFull()){
                System.out.println("큐가 가득차있습니다.");
                return;
            }
            queue[rear]=value;
            rear=rear+1==max?0:rear+1;
            num++;
        }
        public void deQueue(){
            if(this.isEmpty()){
                System.out.println("큐가 비어있습니다.");
                return;
            }
            System.out.println("디큐된 값은 :"+queue[front]);
            front=front+1==max?0:front+1;
            num--;
            //rear=rear+1==max?0:rear++;
        }


        public void peek()
        {
            System.out.println("peek된 데이터는 : "+queue[front]);
        }

        public void dump(){
            System.out.println("큐에 들어있는 값은 : ");
            for(int i=front;i!=rear;i++){
                i=i==max?0:i;
                System.out.print(queue[i]+",");
            }
            System.out.println("현재 front: "+front+", 현재의 rear: "+rear);

        }

        public int capacity(){
            return max;
        }

        public int size(){
            return num;
        }
        public boolean isEmpty() {
            return 0==num;
        }

        public boolean isFull(){
            return max==num;
        }



    }


