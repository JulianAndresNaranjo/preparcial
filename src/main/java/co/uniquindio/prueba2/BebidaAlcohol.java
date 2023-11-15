package co.uniquindio.prueba2;

;
//el enum si esta siendo bien utilizado
public class BebidaAlcohol extends Bebidas{

    private EOrigen EOrigen;
    private int conAlcohol;

    public BebidaAlcohol(String nombre, Float valor) {
        super(nombre, valor);
        this.EOrigen=EOrigen;
        this.conAlcohol=conAlcohol;

    }

    @Override
    public float calcularImpuesto() {
        switch (EOrigen) {
            case NACIONAL:
                if(conAlcohol<50){
                    return (float) (getValor()+(getValor()*((2.0*conAlcohol)/100)));
                }else{
                     return (float) (getValor()+(getValor()*((2.0*50)/100)));
                }
                
            case INTERNACIONAL:
                return  (float) ((getValor() * 1.3) * (1 + (0.3 * conAlcohol)));
        
            default:
                return-1;
        }
    }

    public EOrigen getEOrigen() {
        return EOrigen;

    }public void setEOrigen(EOrigen EOrigen) {
        this.EOrigen = EOrigen;

    }public int getconAlcohol() {
        return conAlcohol;

    }public void setconAlcohol(char conAlcohol) {
        this.conAlcohol = conAlcohol;
    }
    
}
