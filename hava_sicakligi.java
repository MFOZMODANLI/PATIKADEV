import java.util.Scanner;

public class hava_sicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık değeri giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz !");
        }
        if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz !");

        }
        if (heat >= 15 && heat <= 25) {
            System.out.print("Pikniğe gidebilirsin !");

        }
        if (heat > 25) {
            System.out.print("Yüzmeye git !");
        }
        if (heat > 40) {
            System.out.print("Evden çıkma fazla sıcak !");
        }
    inp.close();
    }
    
}
