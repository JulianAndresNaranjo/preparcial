package co.uniquindio.prueba2;

public abstract class Cliente  {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;

    public Cliente(String cedula,String nombre,String apellido,String correo){
        this.cedula= cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
    }
    public abstract float calcularDescuento(float valFactura);

    public String getCedula() {
        return cedula;

    }public void setCedula(String cedula) {
        this.cedula = cedula;
    }public String getNombre() {
        return nombre;

    }public void setNombre(String nombre) {
        this.nombre = nombre;

    }public String getApellido() {
        return apellido;

    }public void setApellido(String apellido) {
        this.apellido = apellido;

    }public String getCorreo() {
        return correo;

    }public void setCorreo(String correo) {
        this.correo = correo;

    }
}
