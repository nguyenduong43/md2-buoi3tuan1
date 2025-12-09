import java.util.Scanner;
public class  tong1cot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("mang co so hang la ");
        int n=sc.nextInt();
        System.out.print("mang co so cot la ");
        int m=sc.nextInt();int t=0;
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("tinh tong cua cot ");
        int x=sc.nextInt();
        for (int i=0;i<n;i++) {
            t=t+a[i][x];
        }
        System.out.println("tong cua cot "+x+"="+t);
    }
}
