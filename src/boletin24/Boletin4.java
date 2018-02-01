
package boletin24;

import java.util.Scanner;


public class Boletin4 {
 
   Scanner f = new Scanner(System.in);
    public void operacion(){
           byte a,b;
         
     System.out.println("Por favor introduzca el primer número");
     a= f.nextByte();
     System.out.println("Por favor introduzca el segundo número");
       b=f.nextByte();
   
        int suma;
        suma=a+b;
       System.out.println("a suma é: "+suma);
       int resta;
       resta= a-b;
       System.out.println("a resta é: "+resta);
       int producto;
       producto= a*b;
       System.out.println("o producto é: "+producto);
       double cociente;
       cociente= a/b;
       System.out.println("o cociente é "+cociente);
       
    }
    public static void main(String[]Args){
        Boletin4 a= new Boletin4();
        a.operacion();
        
    }
    
}
//4- Dedeña un ordinograma que lea 2 números e calcule : 1º a suma , despois a resta,
//a continuación o producto e por último o cociente . Amosa o resultado de cada operación.
