package co.uniquindio.prueba2;

public class BebidaAzucar extends Bebidas{

    private int conAzucar;

    public BebidaAzucar(String nombre, Float valor,char conAzucar) {
        super(nombre, valor);
        this.conAzucar=conAzucar;
        
    }

    @Override
    public float calcularImpuesto() {
        if(conAzucar>35){
            return (float) (getValor()+(getValor()*(25.0/100)));
        }else{
             return (float) (getValor()+(getValor()*(5.0/100)));
        }
       
    }

    public int getConAzucar() {
        return conAzucar;
    }

    public void setConAzucar(char conAzucar) {
        this.conAzucar = conAzucar;
    }
}
