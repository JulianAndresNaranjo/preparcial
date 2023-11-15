package co.uniquindio.prueba2;

import java.util.ArrayList;

public class Factura {

    private Cliente cliente;
    private ArrayList<Productos> listProductos = new ArrayList<Productos>();

    public Factura(Cliente cliente, ArrayList<Productos> listProductos) {
        this.cliente = cliente;
        this.listProductos = listProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getListProductos() {
        return listProductos;
    }

    public void setListProductos(ArrayList<Productos> listProductos) {
        this.listProductos = listProductos;
    }

    public void calcularValor() {

        float valTotal = 0;
        for (int i = 0; i < listProductos.size(); i++) {
            valTotal+=listProductos.get(i).calcularImpuesto();
        }
        cliente.calcularDescuento(valTotal);

    }
}