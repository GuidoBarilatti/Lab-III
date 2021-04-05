package com.company.Punto3;

public class Item {
    private String identificador,descripcion;
    private int cantidad;
    private double precioUnitario;
    public Item (String identificador, String descripcion, int cantidad, double precioUnitario){
        this.identificador=identificador;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }


    public void MostrarItem(Item item){
        System.out.println("Identificador: "+item.getIdentificador());
        System.out.println("Descripcion: "+item.getDescripcion());
        System.out.println("Cantidad: "+item.getCantidad());
        System.out.println("Precio Unitario: $"+item.getPrecioUnitario());
    }

}
