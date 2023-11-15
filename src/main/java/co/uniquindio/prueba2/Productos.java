package co.uniquindio.prueba2;

public abstract class Productos {
    private String nombre;
    private Float valor;

    public Productos(String nombre, Float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    public abstract float calcularImpuesto();

    public String getNombre() {
        return nombre;

    }public void setNombre(String nombre) {
        this.nombre = nombre;

    }public Float getValor() {
        return valor;

    }public void setValor(Float valor) {
        this.valor = valor;
    }

    
}
