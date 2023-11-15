package co.uniquindio.prueba2;

public class main {

    public static void main(String[] args) {

        Panaderia panaderia=new Panaderia("pan tajado", 10000f, true);
        System.out.println(panaderia.calcularImpuesto());
        Estudiante estudiante=new Estudiante("1094893848", "julian", "naranjo", "julianandresnaranjoalzate@gmail.com", 2);
        System.out.println(estudiante.calcularDescuento(10000));
        Profesor profesor=new Profesor("1236987697", "pepe", "ramirez", "pr@gmail.com", ECategoria.ASOCIADO);
        System.out.println(profesor.calcularDescuento(20000));

        //Factura factura=new Factura(profesor, null);
        

    }
}
