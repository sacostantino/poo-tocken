
package ejercicio3.Entidades;

public class Operacion {
    
    private int num1;
    private int num2;
    private String operacion;
    private long resultado;

    public Operacion() {
    }

    public Operacion(int num1, int num2, String operacion, long resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
        this.resultado = resultado;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public long getResultado() {
        return resultado;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setResultado(long resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", operacion=" + operacion + ", resultado=" + resultado + '}';
    }

    
}