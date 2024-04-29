/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpat005tarugodemo;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class AdaptadorTarugoCuadrado implements TarugoRedondo {
    
    TarugoCuadrado tarugoCuadrado;
    
    public AdaptadorTarugoCuadrado (TarugoCuadrado t){
        tarugoCuadrado = t;
    }
    
    @Override
    public float getRadio() {
     
    return tarugoCuadrado.getLado()*(float) (Math.sqrt (2) / 2);
    
    }
}
