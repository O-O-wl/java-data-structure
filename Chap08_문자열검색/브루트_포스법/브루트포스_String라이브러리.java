package Do_It_자료구조.Chap08_문자열검색.브루트_포스법;

import java.util.Scanner;

public class 브루트포스_String라이브러리 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== String 라이브러리 =======");
        System.out.println("=================================");
        System.out.print("텍스트를 입력해주세요 : ");
        String text = scanner.next();
        System.out.print("패턴을 입력해주세요 : ");
        String pattern = scanner.next();
        int result = text.indexOf(pattern);

        if(result == -1){
            System.out.println("탐색 실패");
        }
        else{

            System.out.println(result+1+"번째 문자부터 시작합니다.");
            int len1 = 0;
            for(int i =0 ; i<result ; i++){
                len1+=text.substring(i,i+1).getBytes().length;

            }
            int len2 = 0;
            for(int j =result+pattern.length() ; j<text.length() ; j++){
                len2+=text.substring(j,j+1).getBytes().length;

            }
            len1+=pattern.length();
            System.out.println("txt:"+text);
            System.out.printf(String.format("pat:%%%ds",len1),pattern);
           //System.out.printf("pat:%%%ds%%%d",len1,pattern,len2);

        }
    }
}
