import java.util.Scanner;
public class  duongcheochinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("mang co so hang cot la ");
        int n=sc.nextInt();int t=0;
        int[][] a=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int j=0;
        for (int i=0;i<n;i++) {
            t=t+a[i][j];
            j++;
        }
        System.out.println("tong duong chinh la "+t);
    }
}
