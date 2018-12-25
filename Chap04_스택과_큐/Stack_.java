package Do_It_자료구조.Chap04_스택과_큐;

public class Stack_ {

    int max;   //용량
    int ptr;   // 스택의 포인터  이제 저장될 배열을 가르킴
    int []stk; // 스택

    public Stack_(int size){
        stk = new int[size];
        ptr=0;  //인덱스 -1
        max=size;

    }
    public void push(int value) {
        if(this.isFull()){
            System.out.println("스택이 가득차있습니다.");
        }
        else{
            stk[ptr++]=value;

        }

    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("스택이 비어있습니다.");
            return -1;
        }
        else{
            System.out.println(stk[--ptr]);
            return (stk[ptr]);
        }
    }

    public void peek(){

        System.out.println("peek된 데이터는 : "+stk[ptr-1]);
    }

    public void dump(){
        System.out.println("스택에 들어있는 값은 : ");
        for(int i=0;i<ptr;i++){
            System.out.print(stk[i]+",");
        }
        System.out.println();
    }


    public int size(){

        return ptr;
    }
    public boolean isFull(){
        return
                ptr==max;
    }

    public boolean isEmpty()
    {
        return ptr==0;
    }

    public void clear(){
        ptr=0;
    }

    public void indexOf(int value){
        int index=-1;
        for(int i=ptr ; i>=0 ; i--){
            if(stk[i]==value){
                index=i;
               break;
            }
        }
        if(index==-1){
        System.out.println("스택에 "+value+"는 들어있지 않습니다.");}
        else{
            System.out.println(value+"의 인덱스는 "+index);
        }


    }



    public int capacity(){

        return max;
    }


    public static void main (String [] arg){
        Stack_ stack =new Stack_(3);
        stack.push(10);

        stack.dump();
        stack.push(20);

        stack.dump();
        stack.push(30);

        stack.dump();
        stack.push(40);

        stack.pop();
        stack.dump();
        stack.peek();
    }

}
