
package Boletin27;
import java.util.Scanner;

public class Temperatura {
    Scanner f = new Scanner(System.in);
    public void celsius(){
        double a,b,c;
    System.out.println("Deme a temeperatura en celsius");
    a= f.nextInt();
    b=  (a*33.8);
    System.out.println(b);
    c=   (a+273.15);
    System.out.println(c);
    }
    
    public static void main(String[] args) {
        Temperatura a = new Temperatura();
        a.celsius();
    }
    
}
