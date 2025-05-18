import java.util.Scanner;
import java.lang.Math;

public class hipotenüs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci kenarın uzunluğunu giriniz : ");
        double a=scanner.nextInt();
        System.out.println("İkinci kenarın uzunluğunu giriniz : ");
        double b=scanner.nextInt();
        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hipotenüsün uzunluğu : ");

        scanner.close();
    }
}
