package Do_It_자료구조.Chap08_문자열검색.KMP법;

import java.util.Scanner;

public class KMP법_My {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== KMP =========");
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
    public static int KMP(String text,String pattern){
        int offset = 0; // 패턴시작점
        int size=0;     // 중복사이즈
        int pt=0;       // 현재 텍스트포인터
        int pp=0;       // 현재 패턴 포인터

        int count = 0;
            // i 텍스트인덱스
        for(int i = 0; i<text.length()-pattern.length();i++){
            // j 패턴인덱스
            for(int j = 0 ; j < pattern.length() ; j++){
                count++;
                if(text.charAt(i+j)==pattern.charAt(j)){
                    if(i == 0)
                    pt++;
                    pp++;
                    //  두번째 시작점 유무 확인후 정의
                    if(offset == 0){offset=i;size++; }
                    //  두번째시작점 존재하면 size 증가
                    else if(offset!=0 && text.charAt(offset+size)==pattern.charAt(size)){size++;}

                }
                else{
                    // 두번째 시작점 있으면 설정
                    if(offset !=0){
                        i = offset-1;
                        offset = 0;
                        pt = offset+size;
                        pp = size;
                        size = 0;
                    }
                    pt = pt - pp + 1 ;
                    pt = 0 ;

                }
            }
        }

        System.out.println(count+"번 비교연산했습니다.");
        return -1;
    }
}
