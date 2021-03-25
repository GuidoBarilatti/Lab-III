package com.company;

import com.company.Guia1.Rectangulo;
import com.company.Guia1.Empleado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte opcionMenu;
        System.out.println("Elija un ejercicio a realizar");
        opcionMenu=scanner.nextByte();
        switch (opcionMenu){
            case 1:
                exercise1();
                break;
            case 2:
                exercise2();
                break;

        }

    }
    public static void exercise1(){
        Scanner scanner=new Scanner(System.in);
        Rectangulo rectangulo=new Rectangulo(1.0,1.0);
        System.out.println("El ancho del rectangulo es: "+rectangulo.getAncho());
        System.out.println("El alto del rectangulo es: "+rectangulo.getAlto());
        System.out.println("El perimetro es: " +rectangulo.CalcularPerimetro(rectangulo.getAlto(), rectangulo.getAncho()));
        System.out.println("El area es: "+rectangulo.CalcularArea(rectangulo.getAlto(),rectangulo.getAncho()));
        System.out.println("Ingrese un nuevo alto y ancho para el rectangulo\n");
        double nuevoAlto=scanner.nextDouble(), nuevoAncho=scanner.nextDouble();
        rectangulo.setAlto(nuevoAlto);
        rectangulo.setAncho(nuevoAncho);
        System.out.println("El nuevo perimetro es: " +rectangulo.CalcularPerimetro(rectangulo.getAlto(), rectangulo.getAncho()));
        System.out.println("El nuevo area es: "+rectangulo.CalcularArea(rectangulo.getAlto(),rectangulo.getAncho()));
    }
    public static void exercise2(){
        Empleado Carlos=new Empleado("Carlos","Gutierrez",25000,23456345);
        Empleado Ana=new Empleado("Ana","Sanchez",27500,34234123);
        Carlos.mostrarDatos(Carlos);
        Ana.mostrarDatos(Ana);
        Carlos.setSalario(Carlos.aumentarSalario(Carlos.getSalario(),15));
        Carlos.salarioAnual(Carlos.getSalario());
    }
}