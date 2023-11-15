package co.uniquindio.prueba2;

public class Dulce extends Productos{

    private int conAzucar;

    public Dulce(String nombre, Float valor,char conAzucar) {
        super(nombre, valor);
        this.conAzucar=conAzucar;
    }

    @Override
    public float calcularImpuesto() {
        if(conAzucar>50){
            return (float) (getValor()+(getValor()*(20.0/100)));
        }
        return (float) (getValor()+(getValor()*(10.0/100)));
    }

    public int getConAzucar() {
        return conAzucar;
    }

    public void setConAzucar(char conAzucar) {
        this.conAzucar = conAzucar;
    }
    
}
