import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen boyununuz metre cinsinden giriniz :");
        double a=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        double b=scanner.nextDouble();
        double c=b/(a*a);
        System.out.println("Vücut kitle endeksiniz : "+c);
    }
}
