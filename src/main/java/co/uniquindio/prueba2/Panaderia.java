package co.uniquindio.prueba2;

public class Panaderia extends Productos{

    private boolean conservante;

    public Panaderia(String nombre, Float valor, boolean conservante) {
        super(nombre,valor);
        this.conservante=conservante;
    }

    @Override
    public float calcularImpuesto() {
        if(conservante==true){
            return  (float) (getValor()+(getValor()*(18.0/100)));
        }else{
            return getValor();
        }

        
    }
    
}
