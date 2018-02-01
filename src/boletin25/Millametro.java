
package boletin25;

import java.util.Scanner;


public class Millametro {
    Scanner a = new Scanner(System.in);
    int b= a.nextInt();
            
    public void millasMarinas(){
    System.out.println("Introduzca las millas marítimas: "+b);
        
}
     public void metro(){
         int c = b * 1852;
         System.out.println("En metros son: "+c);
     }

   
    public static void main(String[] args) {
        Millametro a = new Millametro();
        a.millasMarinas();
        a.metro();
    }
    
}
//5- Escribe un programa que lea o valor dunha distancia en millas mariñas e a pase a metros
//( 1 milla mariña = 1852 m )
