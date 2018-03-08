
package heroes.y.villanos;

/**
 *
 * @author Nareyii
 * @date Mar 8, 2018
 * @time 9:19:50 AM
 */
public class Personaje extends Enfrentable {
    //Atributos
    private float fuerza;
    private String bando;
    
    //Constructores
    public Personaje (String nombre, float fuerza, String bando){
        super(nombre);
        this.fuerza = fuerza;
        this.bando = bando;
    }
    public Personaje (String nombre, float fuerza){
        super(nombre);
        this.fuerza = fuerza;
    }
    
    public float getFuerza(){
        return this.fuerza;
    }
    
}
