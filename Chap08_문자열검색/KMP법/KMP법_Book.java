package Do_It_자료구조.Chap08_문자열검색.KMP법;

import java.util.Scanner;

public class KMP법_Book {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== KMP ==========");
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
    static int KMP(String txt , String pat){
        int pt = 1 ;
        int pp = 0 ;
        int [] skip = new int[pat.length()+1];

        skip[pt] =0 ;

        while(pt!=pat.length()){
            if(pat.charAt(pt)==pat.charAt(pp)){
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
            }

        }
        if(pp == pat.length()){
            return pt-pp;
        }
        return -1;
    }
}
