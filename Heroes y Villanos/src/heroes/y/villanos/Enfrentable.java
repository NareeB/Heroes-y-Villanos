
package heroes.y.villanos;

/**
 *
 * @author Nareyii
 * @date Mar 8, 2018
 * @time 9:25:29 AM
 */
public abstract class Enfrentable {
    private String nombre;
    
    public Enfrentable (String nombre){
      this.nombre = nombre;  
    }
    public abstract float getFuerza();
        
}
