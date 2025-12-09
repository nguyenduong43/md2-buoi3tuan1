import java.util.Scanner;
public class timkiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so phan tu cua mang la ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] a=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+i+"=");
            a[i]=sc.nextLine();
        }
        System.out.print("phan tu can tim la ");
        String b=sc.nextLine();int x=-1;
        for (int i=0;i<n;i++)
        {
            if (a[i].equals(b)) {x=i;break;}
        }
        if (x==-1) System.out.println("khong co phan tu can tim ");
        else System.out.println(b+" tai vi tri "+x);

    }
}
