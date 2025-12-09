import java.util.Scanner;
public class xoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang ");
        int n=sc.nextInt();
        System.out.print("phan tu can tim ");
        int x=sc.nextInt();int z=-1;
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("phan tu thu "+i+"=");
            a[i]=sc.nextInt();
            if (a[i]==x) z=i;
        }
        if (z!=-1)
        {for (int i=z;i<n-1;i++) a[i]=a[i+1];n=n-1;}
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
