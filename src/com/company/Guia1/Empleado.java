package com.company.Guia1;

public class Empleado {
    private String nombre;
    private  String apellido;
    private double salario;
    private int dni;
    public Empleado(String nombre, String apellido, double salario, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double aumentarSalario(double salario, int porcentaje){
        double aumento=porcentaje*salario/100;
        return salario+aumento;
    }
    public void salarioAnual(double salario){
        System.out.println("El salario anual es: "+(salario*12));
    }
    public void mostrarDatos(Empleado empleado){
        System.out.println("DNI: "+empleado.getDni());
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Apellido: "+empleado.getApellido());
        System.out.println("salario: "+empleado.getSalario());
    }
}

