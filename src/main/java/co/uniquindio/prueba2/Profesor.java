package co.uniquindio.prueba2;

public class Profesor extends Cliente{

    private ECategoria eCategoria;

    public Profesor(String cedula, String nombre, String apellido, String correo, ECategoria e) {
        super(cedula, nombre, apellido, correo);
        this.eCategoria=e;
        
    }
    @Override
    public float calcularDescuento(float valFactura) {
        switch (eCategoria) {
            case AUXILIAR:
                return  (float) (valFactura-(valFactura*(3.0/100)));
            case ASISTENTE:
                return  (float) (valFactura-(valFactura*(5.0/100)));
            case ASOCIADO:
                return  (float) (valFactura-(valFactura*(10.0/100)));
            case TITULAR:
                return  (float) (valFactura-(valFactura*(16.0/100)));
            default:
                return -1;
        }
    }


    public ECategoria geteCategoria() {
        return eCategoria;

    }public void seteCategoria(ECategoria e) {
        eCategoria = e;
    }
    
    
}
