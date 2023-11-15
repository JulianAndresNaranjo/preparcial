package co.uniquindio.prueba2;

public class Fruteria extends Productos{

    private int kilos;

    public Fruteria(String nombre, Float valor,char kilos) {
        super(nombre, valor);
        this.kilos=kilos;
    }

    @Override
    public float calcularImpuesto() {
        int imp= (kilos-7);
        if(kilos>3 && imp>0){
            return (float) ((getValor()+(getValor()*(imp/100)))*2);
        }
        return  (float) (getValor()+(getValor()*(7/100)));

    }
    

    

    
}