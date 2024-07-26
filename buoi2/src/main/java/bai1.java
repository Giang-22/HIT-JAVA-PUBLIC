
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner b1 = new Scanner(System.in);
        double r;
        do{
            System.out.print("nhap ban kinh: ");
            r = b1.nextDouble();
        }
        while(r<=0 || r>=1000);
        System.out.printf("%.3f%n", 2*r*3.14);
        System.out.printf(" " + "%.3f%n", r*r*3.14);
    }
}
