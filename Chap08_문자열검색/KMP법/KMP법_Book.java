package Do_It_자료구조.Chap08_문자열검색.KMP법;

import java.util.Scanner;

public class KMP법_Book {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== KMP2 ==========");
        System.out.print("텍스트를 입력해주세요 : ");
        String text = scanner.next();
        System.out.print("패턴을 입력해주세요 : ");
        String pattern = scanner.next();
        int result = KMP(text,pattern);

        if(result == -1){
            System.out.println("탐색 실패");
        }
        else{
            System.out.println(result+1+"번째 문자부터 시작합니다.");
        }
    }
    static void showArray(int arr[]){
        for(int i = 0 ; i < arr.length; i ++){
            System.out.print("skip-"+i+":"+arr[i]+" / ");
        }
    }
    static int KMP(String txt , String pat){
        int pt = 1 ;
        int pp = 0 ;
        int [] skip = new int[pat.length()+1];


        skip[pt] =0 ;


        // 패턴의 포인터가 모두 돌떄까지
        while(pt!=pat.length()){
            // 각각의 패턴에서 같은 값을 가지면
            if(pat.charAt(pt)==pat.charAt(pp)){
                // skip 배열에 저장
               skip[++pt] = ++pp;
            }else if(pp == 0){
                skip[++pt] = pp;
            }
            else{
                pp =skip[pp];
            }
            pt = pp =0;
            while(pt != txt.length() && pp != pat.length()){
                if(txt.charAt(pt)==pat.charAt(pp)){
                    pt++;
                    pp++;

                }else if( pp == 0){
                    pt++;
                }else{
                    pp = skip[pp];
                }
                showArray(skip);
            }

        }
        if(pp == pat.length()){
            return pt-pp;
        }
        return -1;
    }
}
