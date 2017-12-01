
package boletin21;

public class Boletin1 {
    byte altura=3;
    byte base=4;
public void area(){
    int area=(altura*base)/2;
    System.out.println(area);
}
    
    public static void main(String[] args) {
       Boletin1 a= new Boletin1();
       a.area();
    }
    
}


/**1- Deseña un algoritmo que calcule o área dun triángulo. A  saida faise  por pantalla . 
( para codificar este programa inicializa a base ao valor 4, e a altura ao valor 3 ) .
*/ 