/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Eurosb {
    Scanner v= new Scanner(System.in);
    int a = v.nextInt();
    public void dinero(){
       int cien =a/100;
       System.out.println("Billetes de cien:  "+cien);
       int resto=a%100;
       int veinte= resto/20;
       System.out.println("Billetes de veinte:  "+veinte);
       int resto2=resto%20;
       int cinco= resto2/5;
       System.out.println("Billetes de cinco:  "+cinco);
       int resto3=resto2%5;
       int uno=resto3/1;
       System.out.println("Billetes de un euro  "+uno);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eurosb a = new Eurosb();
        a.dinero();
    }
    
}
