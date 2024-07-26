import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner b2 = new Scanner(System.in);
        int n;
        System.out.print("nhap so phan tu cua mang: ");
        n = b2.nextInt();
        int a[] = new int [n];
        for(int i = 0;i<n;i++){
            System.out.print("a[" + i + "] = ");
            a[i] = b2.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(i % 2 == 1)
            {
                if(i == (n-1)){
                    a[i] += a[i-1];
                }
                else {
                    a[i] += Math.abs(a[i+1] - a[i-1]);
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
