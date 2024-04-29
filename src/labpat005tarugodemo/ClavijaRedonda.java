/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpat005tarugodemo;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class ClavijaRedonda implements TarugoRedondo {
    
    private float radio;
    
    public ClavijaRedonda (float radio){
        this.radio = radio;
    }
    
    @Override
    public float getRadio(){
        return radio;
    }
}
