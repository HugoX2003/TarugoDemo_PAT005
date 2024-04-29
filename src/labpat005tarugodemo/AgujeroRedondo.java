/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpat005tarugodemo;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class AgujeroRedondo {
    
    int radio;
    
    public AgujeroRedondo (int radio){
        this.radio = radio;
    }
    
    public int getRadio() {
        return radio;
    }
    
    public boolean encajar(TarugoRedondo tarugo) {
        return (tarugo.getRadio()<=radio);
    }
}
