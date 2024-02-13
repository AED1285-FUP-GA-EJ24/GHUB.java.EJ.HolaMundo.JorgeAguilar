package miPrincipal;
//Proposito: Calcular la distancia a partir
//de la velocidad y el tiempo
//Autor: Jorge Emilio Aguilar Guerrero
//Fecha 12/Feb/2024
import java.util.Scanner;
public class Distancia { 

    public static void main(String args[]){
        //Definir objeto Scanner;
        Scanner entrada = new Scanner (System.in);
        //Definicion de Variable de salida
        float d; //define la variable d como real
        //Definicion de variable de entrada
        float v; //define a la variable de entrada v como real
        float t; // define a la variable de entrada t como real

        System.out.print("Proporciona velocidad en m/s: "); //escritura
        v = entrada.nextFloat(); //Lectura de la variable v

        System.out.print("Proporciona tiempo en s: "); //escritura
        t = entrada.nextFloat(); //Lectura de la variable t

        d = v*t;

        System.out.print("Distancia = "+d);
        entrada.close();
    }
}