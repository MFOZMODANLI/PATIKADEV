import java.util.Scanner;
import java.lang.Math;
public class daire {
    
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Yarı çapı giriniz : ");
    double r=scanner.nextDouble();
    double alan,cevre;
    alan=Math.PI* r*r;
    cevre=Math.PI*2*r;
    System.out.printf("Dairenin alanı : %.2f \n",alan);
    System.out.printf("Dairenin çevresi : %.2f" ,cevre);

    
    
    
    
    scanner.close();
}
}
