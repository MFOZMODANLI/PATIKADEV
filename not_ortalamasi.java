import java.util.Scanner;

public class not_ortalamasi {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,müzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuz giriniz: ");
        mat=scanner.nextInt();
        System.out.println("Fizik notunuz giriniz: ");
        fizik=scanner.nextInt();
        System.out.println("Kimya notunuz giriniz: ");
        kimya=scanner.nextInt();
        System.out.println("Türkçe notunuz giriniz: ");
        turkce=scanner.nextInt();
        System.out.println("Tarih notunuz giriniz: ");
        tarih=scanner.nextInt();
        System.out.println("Müzik notunuz giriniz: ");
        müzik=scanner.nextInt();

        double sonuc=(mat+fizik+kimya+turkce+tarih+müzik)/6;
        System.out.println("Ortalamanız : "+sonuc);

      scanner.close();
  
    }
    
}