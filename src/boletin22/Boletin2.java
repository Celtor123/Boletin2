
package boletin22;

public class Boletin2 {
    byte lado=3;
    public void area(){
        int area=lado*lado;
       System.out.print(area);
    }

public static void main(String[] args) {
       Boletin2 a= new Boletin2();
       a.area();
    }
}
//2- Realiza un ordinograma que permita calcular o área dun cadrado de 3m de lado.