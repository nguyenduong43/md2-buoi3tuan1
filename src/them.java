import java.util.Scanner;
public class them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang ");
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + i + "=");
            a[i] = sc.nextInt();
        }
        System.out.print("phan tu dc them la ");
        int b = sc.nextInt();
        System.out.print("them tai vi tri " );
        int c = sc.nextInt();
        for (int j=n;j>c;j--)
        {
            a[j]=a[j-1];
        }
        a[c]=b;
        n=n+1;
        for (int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
