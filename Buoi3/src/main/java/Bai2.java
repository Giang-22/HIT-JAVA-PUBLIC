import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner b2 = new Scanner(System.in);
        int cnt = 0;
        String str;
        str = b2.nextLine();
        int length = str.length();
        for(int i=0;i<=length/2;i++){
            char str1, str2;
            str1 = str.charAt(i);
            str2 = str.charAt(length-1);
            if(str1 == str2){
                cnt++;
            }
            else {
                System.out.println(str.toLowerCase());
                cnt = 0;
                break;
            }
            length--;
        }
        if(cnt != 0){
            System.out.println(str.toUpperCase());
        }
    }
}
