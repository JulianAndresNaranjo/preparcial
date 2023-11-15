package co.uniquindio.prueba2;

public class Estudiante extends Cliente {

    private int semestre;
   
    public Estudiante(String cedula, String nombre, String apellido, String correo,int semestre) {
        super(cedula, nombre, apellido, correo);
        this.semestre=semestre;
    }

    @Override
    public float calcularDescuento(float valFactura) {
        
        return  (float) (valFactura-(valFactura*((1.2*semestre)/100)));
    }
    
}
