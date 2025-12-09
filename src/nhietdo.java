import java.util.Scanner;
public class nhietdo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=-1;double x;
        System.out.println("menu");
        System.out.println("1.C->F");
        System.out.println("2.F->C");
        System.out.println("0.Exit");
        while (a!=0){
            System.out.print("lua chon cua ban la ");
            a=sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("nham do C=");
                    double c=sc.nextDouble();
                    x=(c*1.8)+32;
                    System.out.println(c+"C="+x+"F");
                    break;
                case 2:
                    System.out.print("nhap do F=");
                    double f=sc.nextDouble();
                    x=(f-32)/1.8;
                    System.out.println(f+"F="+x+"C");
                    break;
                case 3:
                    a=0;
                    break;
                    default:
                        System.out.println("lua chon khong hop le");
                        break;
            }
        }
    }
}