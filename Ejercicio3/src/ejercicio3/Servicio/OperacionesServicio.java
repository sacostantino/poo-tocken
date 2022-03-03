
package ejercicio3.Servicio;

import ejercicio3.Entidades.Operacion;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OperacionesServicio {
    
public Operacion nuevaOperacion(){
    Operacion op = new Operacion();
    Scanner leer= new Scanner (System.in);
    int operacion;
    
    System.out.println("Ingrese el primer valor");
    op.setNum1(leer.nextInt());
    System.out.println("Ingrese el segundo valor");
    op.setNum2(leer.nextInt());    
        
    do {
        System.out.println("Ingrese la operacion a realizar");
        System.out.println("1 - (suma)");        
        System.out.println("2 - (resta)");
        System.out.println("3 - (Multiplicacion)");
        System.out.println("4 - (Division)");
        operacion=leer.nextInt();  
        
    } while (operacion!=1 && operacion !=2 && operacion !=3 && operacion !=4);
    switch (operacion){
        case 1:            
            op.setOperacion("+");
            break;
        case 2:
            op.setOperacion("-");
            break;
        case 3:
            op.setOperacion("*");
            break;
        case 4:
            op.setOperacion("/");    }        
        
    return op;
} 

public void realizaOperacion(Operacion op){
    
        switch (op.getOperacion()){
            case "+":                
                op.setResultado(op.getNum1()+op.getNum2());
                break;
            case "-":
                op.setResultado(op.getNum1()-op.getNum2());
                break;
            case "*":
                if (op.getNum1()==0){
                    op.setResultado(0);
                    System.out.println("Error, el primer numero ingresado es cero");                    
                }else if (op.getNum2()==0){
                    op.setResultado(0);
                    System.out.println("Error, el Segundo numero ingresado es cero");     
                } else op.setResultado(op.getNum1()*op.getNum2());
                break;
            case "/":
                if (op.getNum1()==0){
                    op.setResultado(0);
                    System.out.println("Error, el primer numero ingresado es cero");                    
                }else if (op.getNum2()==0){
                    op.setResultado(0);
                    System.out.println("Error, el Segundo numero ingresado es cero");     
                } else op.setResultado(op.getNum1()/op.getNum2());
            
        }
        
        System.out.println("El resultado de la " + op.getOperacion()+" es "+op.getResultado());    
    
}

}
