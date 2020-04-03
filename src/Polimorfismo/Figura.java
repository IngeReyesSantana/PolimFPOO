
package Polimorfismo;

/**
 * @author Reyes Hernando Santana Perez
 * @ID 170035
 */

public class Figura {
    
    private int base, altura;
    
    public void SetBase(int SetBase){
        this.base = SetBase;
    }
    
    public int GetBase(){
        return this.base;
    }
    
    public void SetAltura(int SetAltura){
        this.altura = SetAltura;
    }
    
    public int GetAltura(){
        return this.altura;
    }
    
    public void ResultadoArea(){
        System.out.println("El area es:");
    }
    
}
