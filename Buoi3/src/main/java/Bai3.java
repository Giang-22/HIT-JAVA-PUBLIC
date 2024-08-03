import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner b3 = new Scanner(System.in);
        int a, b, c, d;
        d = (int)(Math.random()*2);
        if(d == 1){
            a = (int)(Math.random()*11);
            b = (int)(Math.random()*11);
            c = a + b;
        }
        else{
            do{
                a = (int)(Math.random()*11);
                b = (int)(Math.random()*11);
                c = (int)(Math.random()*21);
            }while (a + b == c);
        }
        System.out.println(a + " + " + b + " = " + c);
        String str;
        System.out.print("Phép tính trên đ/s: ");
        str = b3.nextLine();
        if(str.equals("Y") && a + b == c || str.equals("N") && a + b != c){
            System.out.println("Chính xác!");
        }
        else {
            System.out.println("Sai!");
        }
    }
}
