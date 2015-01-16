
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author @Patricio Fernandez <patricio.fernandez.florez@gmail.com>
 */
public class Proceso extends Thread {

    Process proceso;
    String nombre;
    
    public Proceso(Process proceso,String nombre) {
        this.proceso=proceso;
        this.nombre=nombre;
    }
    
    
    
    public void run() {
        try {
            proceso.waitFor();
            //Si salta la excepcion es debido a que lo he cerrado a través de la interfaz
            try {
                Controlador.eliminar(nombre);
            } catch (Exception e) {
                
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
