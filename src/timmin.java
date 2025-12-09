import java.util.Scanner;
public class timmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang la ");
        int n = sc.nextInt();
        int[] a = new int[100];
        int min= 99999, x = -1;
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + "=");
            a[i] = sc.nextInt();
            if (a[i] < min) {
                min = a[i];
                x = i;
            }
        }
        System.out.println("gia tri lon nhat trong mang la "+min+" tai vi tri "+x);
    }
}
