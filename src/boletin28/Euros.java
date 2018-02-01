/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Euros {
   Scanner a = new Scanner(System.in);
     public void dinero(){
         System.out.println("Poña os billetes de cen euros");
          
          int b=a.nextInt();
     
     
         System.out.println("Poña os billetes de veinte euros");
          
          int c=a.nextInt();
     
    
         System.out.println("Poña os billetes de cinco euros");
          
          int d=a.nextInt();
     
    
         System.out.println("Poña as monedas de un euro");
          int e=a.nextInt();
          
     int f=b*100+c*20+d*5+e;
     System.out.println(f);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Euros a= new Euros();
        a.dinero();
        
    }
    
}
