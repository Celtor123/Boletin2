/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin210;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Salario {
    Scanner a= new Scanner(System.in);
    static int bruto;
    public int saldoBruto(){
        System.out.println("Poña o soldo en bruto que percibe: " );
        int e = a.nextInt();
        System.out.println("Poña o recaudado das ventas");
        int f= a.nextInt();
        f=5*f/100;
        System.out.println("Poña o kilómetro percorrido");
        int km=a.nextInt();
        km=2*km;
        int dietas=30;
        bruto=e-f-dietas-km;
        System.out.println("O soldo bruto é "+bruto);
        return bruto;
    }
    public void saldoLiquido(int bruto){
        int IRPF=bruto*(18/100);
        int SS=36;
        int liquido= bruto-IRPF-SS;
        System.out.println("O soldo líquido é: "+ liquido);
    }
        
    
         public static void main(String[] args) {
             Salario t= new Salario();
             t.saldoBruto();
             t.saldoLiquido(bruto);
         }
    
}
//Fai o algoritmo que calcule o soldo bruto e líquido, a percibir, por unha persoa .
//Sabendo que o soldo total inclue os seguintes conceptos :
//
//Soldo fixo. 
//Comisión : 5% sobre importe total de vendas
//Quilometraxe : 2 € por km
//Dietas : 30 € por día de desprazamento .
//Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
//I.R.P.F. = 18 % do soldo total .
//Retención a seguridade social : 36 € .