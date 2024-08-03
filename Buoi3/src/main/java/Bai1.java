import java.util.Scanner;

public class Bai1 {
    public static final String square = "Square";
    public static final String triangle = "Triangle";
    public static final String circle = "Circle";
    public static void main(String[] args) {
        Scanner b1 = new Scanner(System.in);
        int a,b,c;
        String str;
        str = b1.nextLine();
        if(str.equals(square)){
            a = b1.nextInt();
            System.out.print(Math.pow(a,2));
        }
        else if(str.equals(triangle)){
            a = b1.nextInt();
            b = b1.nextInt();
            c = b1.nextInt();
            if(a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a){
                System.out.print(-1);
            }
            else{
                int p = (a+b+c)/2;
                System.out.printf("%.2f",Math.sqrt(p*(p-a)*(p-b)*(p-c)));
            }
        }
        else if(str.equals(circle)){
            a = b1.nextInt();
            System.out.printf("%.2f",Math.pow(a,2)*Math.PI);
        }
        else{
            System.out.print("Hình dạng không hợp lệ!");
        }
    }
}
