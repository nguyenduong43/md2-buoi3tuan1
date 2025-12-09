import java.util.Scanner;
public class sinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so sinh vien la ");
        int n = sc.nextInt();int t=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("diem thi sinh thu " + i + "=");
            a[i] = sc.nextInt();
            if (a[i]>5) t++;
        }
        System.out.println("so sinh vien do la "+t);
    }
}
