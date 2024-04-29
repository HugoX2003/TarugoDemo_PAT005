/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpat005tarugodemo;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class ClavijaCuadrada implements TarugoCuadrado {
    
    private int lado;
    
    public ClavijaCuadrada (int lado){
        this.lado = lado;
    }
    
    @Override
    public int getLado(){
        return lado;
    }
    
}
