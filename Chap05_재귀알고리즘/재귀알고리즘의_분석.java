package Do_It_자료구조.Chap05_재귀알고리즘;

public class 재귀알고리즘의_분석 {


    public static void commit(int n , int nested,int stage){
        if(n>0){
            commit(n-1,nested+1,1);
            System.out.println("N:"+n+" , n번째 호출 : "+nested+" , n번째 라인: "+stage);
            commit(n-2,nested+1,2);
        }

        /*
        * 상향식 분석과 하향식 분석
        * 상향식분석 : 일어나는 순서대로 생각
        * 하향식분석 : 더이상 재귀가 일어나지 않는 지점부터 생각
        */
    }

    public static void main(String [] arg){
        commit(4,0,0);
    }
}
