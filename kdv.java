import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ücret giriniz : ");
        double ücret=scanner.nextDouble();
        double kdv=(ücret)+(ücret*18/100);
        System.out.println("KDV'siz fiyat : "+ücret);
        System.out.println("Ürünün KDV'li fiyatı : "+kdv);
        System.out.println("KDV tutarı : "+(ücret*18/100));
        














        scanner.close();

    }
    
}
