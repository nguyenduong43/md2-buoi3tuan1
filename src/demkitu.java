import java.util.Scanner;
public class demkitu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("chuoi nhap vao la ");
        String s=sc.nextLine();
        System.out.println("ki tu can tim la ");
        char s1 = sc.next().charAt(0);
        int t=0;
        for (int i=0;i<s.length();i++) {
            int c=s.charAt(i);
            if (c==s1) t=t+1;
        }
        System.out.println(s1+" xuat hien "+t+" lan");
    }
}
