/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpat005tarugodemo;

import java.util.Scanner;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class TarugoDemo {

    public static void main(String[] args) {
        
        System.out.println("PRUEBA ADAPTADOR TARUGO");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del agujero: ");
        float radioAgujero = sc.nextInt();
        AgujeroRedondo ar = new AgujeroRedondo((int)radioAgujero);

        System.out.print("Ingrese: ");
        System.out.print("\n1 --> Clavija Redonda");
        System.out.print("\n2 --> Clavija Cuadrada\n");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese: El radio o lado de la clavija: ");
        float parametro = sc.nextInt();

        if (opcion == 1) {
            ClavijaRedonda cr = new ClavijaRedonda((int)parametro);
            encajar(ar, cr);
        } else {
            ClavijaCuadrada cc = new ClavijaCuadrada((int)parametro);
            AdaptadorTarugoCuadrado tc = new AdaptadorTarugoCuadrado(cc);
            encajar(ar, tc);

        }
        
    }
    
    public static void encajar(AgujeroRedondo ar, TarugoRedondo tr){
        if(ar.encajar(tr))
            System.out.println("La clavija encaja perfectamente");
        else
            System.out.println("La clavija no encaja");
    }
    
}
