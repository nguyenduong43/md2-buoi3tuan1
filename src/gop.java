import java.util.Scanner;
public class gop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang a la ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("phan tu thu "+i+"=");
            a[i]=sc.nextInt();
        }
        System.out.print("so phan tu cua mang b la ");
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) {
            System.out.print("phan tu thu "+i+"=");
            b[i]=sc.nextInt();
        }
        int[] c=new int[n+m];
        for(int i=0;i<n;i++)
            c[i]=a[i];;
        for (int i=0;i<m;i++)
            c[n+i]=b[i];
        for (int i=0;i<n+m;i++)
            System.out.print(c[i]+" ");
    }
}
