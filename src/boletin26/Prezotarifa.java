/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin26;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Prezotarifa {
    Scanner a= new Scanner(System.in);
public void desconto(){
    System.out.println("Poña o valor neto da compra: ");
    int b =a.nextInt();
    
    System.out.println("Poña o prezo rebaixado");
    int c =a.nextInt();
    float d= b-c;
   d= b/d;
    d= 100/d;
    System.out.println("a porcentaxe de rebaixa é de  "+d+"%");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prezotarifa a = new Prezotarifa();
        a.desconto();
    }
    
}
