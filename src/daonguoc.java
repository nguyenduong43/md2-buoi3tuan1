import java.util.Scanner;
public class daonguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang la ");
        int n=sc.nextInt();
        int[] a=new int[10];
        for (int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+i+"=");
            a[i]=sc.nextInt();
        }
        for  (int i=0;i<n/2;i++){
            int t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
        for (int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
