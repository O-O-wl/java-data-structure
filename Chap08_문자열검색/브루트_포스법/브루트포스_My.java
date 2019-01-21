package Do_It_자료구조.Chap08_문자열검색.브루트_포스법;

import java.util.Scanner;

public class 브루트포스_My {
    public static void main(String arg[]) {
        boolean contain = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("텍스트를 입력해주세요 : ");
        String text = scanner.next();
        System.out.print("패턴을 입력해주세요 : ");
        String pattern = scanner.next();
        //StringBuffer stringBuffer = new StringBuffer(text);
        //for()
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
                if(j == pattern.length()-1){
                    contain =true;
                    System.out.println(i+"번째 문자열부터"+pattern+"은 "+text+"에 포함됩니다.");
                }
            }
        }
        if(!contain){
            System.out.println(pattern+"은"+text+"에 포함되어 있지 않습니다.");
        }
    }
}





