import java.util.Scanner;

public class hesap_makinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("İlk Sayıyı Giriniz : ");
		int n1 = scanner.nextInt();

		System.out.print("İkinci Sayıyı Giriniz : ");
		int n2 = scanner.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Lütfen Seçiminizi Yapınız: ");
		int select = scanner.nextInt();

		switch (select) {
		case 1: {
			System.out.println("Toplama : " + (n1+n2));
			break;
		}
		case 2: {
			System.out.println("Çıkarma : " + (n1-n2));
			break;
		}
		case 3: {
			System.out.println("Çarpma : " + (n1*n2));
			break;
		}
		case 4: {
			if (n2!=0) {
				System.out.println("Bölme :" + (n1/n2));
			}else {
				System.out.println("Sayı 0'a bölünemez.");
			}
			break;
		}
		default:
			System.out.println("Lütfen Geçerli Bir Sayı Giriniz:");
			break;
		}
       scanner.close(); 
    }
}
