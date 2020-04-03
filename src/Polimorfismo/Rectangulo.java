
package Polimorfismo;

import java.util.Scanner;

/**
 * @author Reyes Hernando Santana Perez
 * @ID 170035
 */

public class Rectangulo extends Figura{
    
    protected int resultado;
    Scanner sc = new Scanner(System.in);
    
    public Rectangulo(){
        System.out.println("Digite la Base:");
        this.SetBase(sc.nextInt());
        System.out.println("Digite la Altura:");
        this.SetAltura(sc.nextInt());
    }
    
    @Override
    public void ResultadoArea(){
        resultado = this.GetAltura()*this.GetBase();
        System.out.println("El area del rectangulo es: "+resultado);
        System.out.println("");
    }
    
}
