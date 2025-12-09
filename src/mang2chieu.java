import java.util.Scanner;
public class mang2chieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("mang co so hang la ");
        int n=sc.nextInt();
        int x=-1,y=-1;
        System.out.print("mang co so cot la ");
        int m=sc.nextInt();int max=-9999;
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = sc.nextInt();
                if (a[i][j] > max) {max = a[i][j];x=i;y=j;}
            }
            System.out.println();
        }
        System.out.println("gia tri lon nhat cua mang la "+max+" tai vi tri i="+x+" va j="+y);
    }
}
