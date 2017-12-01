
package boletin23;

import java.util.Scanner;


public class Boletin3 {
    Scanner a= new Scanner(System.in);
    public void cambio(){
    System.out.println("Por favor inserta a cantidade €");
    double b=a.nextDouble();
    double dolares =  b * 1.19 ;
    System.out.println(dolares+"$");
    }

public static void main(String[] args) {
      Boletin3 a=new Boletin3();
      a.cambio();
      }
}

//3- Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado )