import java.util.Scanner;

public class ucak_bileti_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Mesafeyi km türünden giriniz : ");
		double distance = scanner.nextDouble();

		System.out.print("Yaşınızı giriniz : ");
		int age = scanner.nextInt();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		int choice = scanner.nextInt();

		double price = distance * 0.10;

		if ((age > 0) && (distance > 0) && ((choice == 1) || (choice == 2))) {

			if (age < 12) {

				price *= 0.5;

			} else if ((age >= 12) && (age <= 24)) {

				price *= 0.9;

			} else if ((age > 65)) {

				price *= 0.7;
			}

			if (choice == 2) {

				price *= 2;
				price *= 0.8;

			}

			System.out.println("Toplam Tutar = " + price + "TL");
		} else {
			System.out.println("Hatalı Veri Gitdiniz !");
		}
        scanner.close();
    }
    
}
