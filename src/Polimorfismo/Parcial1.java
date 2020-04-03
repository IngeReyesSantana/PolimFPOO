package Polimorfismo;

import java.util.Scanner;

/**
 * @author Reyes Hernando Santana Perez
 * @ID 170035
 */
public class Parcial1 {

    public static void main(String[] args) {
        //Variables
        int figura;
        Scanner sc = new Scanner(System.in);
        //Intanciar clase Figura
        Figura objFigura = new Figura();
        do {
            //Menus de seleccion
            System.out.println("Desea calcular el area de:");
            System.out.println("0: Salir");
            System.out.println("1: Cuadrado");
            System.out.println("2: Rectangulo");
            System.out.println("3: Triangulo");
            System.out.println("");
            figura = sc.nextInt();
            switch (figura) {
                case 1:
                    objFigura = new Cuadrado();
                    objFigura.ResultadoArea();
                    break;
                case 2:
                    objFigura = new Rectangulo();
                    objFigura.ResultadoArea();
                    break;
                case 3:
                    objFigura = new Triangulo();
                    objFigura.ResultadoArea();
                    break;
            }
        } while (figura != 0);
    }

}
