import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner b3 = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap kich thuoc mang: ");
            n = b3.nextInt();
        }
        while(n<1 || n>50);
        int m=1,k=0;
        int a[][] = new int[n+1][n+1];
        for(int l=n;l>=m;l--){
            for(int i=m;i<=m;i++){
                for(int j=m;j<=l;j++){
                    k++;
                    a[i][j] = k;
                }
            }
            for(int j=l;j<=l;j++){
                for(int i=m+1;i<=l;i++){
                    k++;
                    a[i][j] = k;
                }
            }
            for(int i=l;i<=l;i++){
                for(int j = l-1;j>=m;j--){
                    k++;
                    a[i][j] = k;
                }
            }
            for(int j=m;j<=m;j++){
                for(int i=l-1;i>m;i--){
                    k++;
                    a[i][j] = k;
                }
            }
            m++;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
