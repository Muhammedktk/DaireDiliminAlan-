import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,Alan,pi,r;
        pi=3.14;
        System.out.println("YarıÇapı Giriniz:");
        r=input.nextDouble();
        System.out.println("Açıyı Giriniz:");
        a=input.nextDouble();
        Alan = (pi*r*r*a)/360 ;
        System.out.println("ALAN:"+Alan );
    }
}
