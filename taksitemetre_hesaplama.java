import java.util.Scanner;

public class taksitemetre_hesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double tutar =10;
        int km;
        System.out.println("Mesafeyi kilomeyre cinsinden giriniz : ");
        km=scanner.nextInt();
        tutar=tutar+ km*2.20;


        if(tutar<20){
            System.out.println("Kısa mesefa ücreti 20 tl'dir..");
            tutar=20;
            }
            else {
                System.out.println("Ücretiniz : "+tutar);
            }

        scanner.close();
    }
}
