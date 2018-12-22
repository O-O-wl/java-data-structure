package Do_It_자료구조.Chap04_스택과_큐;

public class Queue_ {
    int [] queue;
    int max;
    int num;

    public Queue_(int size){
        queue=new int[size];
        max=size;
        num=0;
    }
    public void enQueue(int value){
        if(this.isFull()){
            System.out.println("큐가 가득차있습니다.");
            return;
        }
        queue[num++]=value;

    }
    public void deQueue(){
        if(this.isEmpty()){
            System.out.println("큐가 비어있습니다.");
            return;
        }
        System.out.println("디큐된 데이터는 "+queue[0]+"입니다.");
        for(int i=0;i<num;i++){
            queue[i]=queue[i+1];
        }
        num--;

    }


    public void peek(){
        System.out.println("peek된 데이터는 : "+queue[0]);
    }

    public void dump(){
        System.out.println("큐에 들어있는 값은 : ");
        for(int i=0;i<num;i++){
            System.out.print(queue[i]+",");
        }
        System.out.println();
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }
    public boolean isEmpty(){
        return 0==num;
    }

    public boolean isFull(){
        return max==num;
    }



}
