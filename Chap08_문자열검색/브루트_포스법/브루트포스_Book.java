package Do_It_자료구조.Chap08_문자열검색.브루트_포스법;

import java.util.Scanner;

public class 브루트포스_Book {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.print("텍스트를 입력해주세요 : ");
        String text = scanner.next();
        System.out.print("패턴을 입력해주세요 : ");
        String pattern = scanner.next();
        int result = bfMatch(text,pattern);
        if(result == -1){
            System.out.println("탐색 실패");
        }
        else{
            System.out.println(result+1+"번째 문자부터 시작합니다.");
        }
    }

    //일치시 일치 인덱스 반환
    static int bfMatch(String text, String pattern){
        int pointOfText = 0;
        int pointOfPattern = 0;

        while(pointOfText != text.length() && pointOfPattern!=pattern.length()){
            if(text.charAt(pointOfText) == pattern.charAt(pointOfPattern)){
               // 매칭성공시 포인터 각각증가 //
                pointOfPattern++;
                pointOfText++;

            }
            else{
                /* 매칭실패시  텍스트는 여태 패턴과 함께 증가한 카운트만큼
                 * 뺀 뒤 그 다음 인덱스로 */
                pointOfText = pointOfText - pointOfPattern +1;
                /*   패턴의 포인터는 0으로  */
                pointOfPattern = 0;
            }

        }
        if (pointOfPattern==pattern.length()){
            return pointOfText-pointOfPattern;
        }

        // 불일치
        return -1;
    }
}
