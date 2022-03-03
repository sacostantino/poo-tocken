
package ejercicio3;

import ejercicio3.Entidades.Operacion;
import ejercicio3.Servicio.OperacionesServicio;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio3 {

    public static void main(String[] args) {

        OperacionesServicio os = new OperacionesServicio();
        
        Operacion op = os.nuevaOperacion();
        
        os.realizaOperacion(op); 
        

    }
    
}
