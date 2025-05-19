import java.util.Scanner;

public class kullanıcı_girişi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		String userNameExpected = "fatih";
		String passwordExpected = "fatih123";

		System.out.print("Kullanıcı Adınızı Giriniz : ");
		String userName = scanner.nextLine();

		System.out.print("Şifrenizi Giriniz : ");
		String password = scanner.nextLine();

		if (userName.equals(userNameExpected) && password.equals(passwordExpected)) {
			System.out.println("Giriş Yaptınız.");
		} else {
            System.out.println("Bilgileriniz yanlış...");
		}
        scanner.close();
    }
    
}
