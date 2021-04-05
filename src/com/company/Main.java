package com.company;

import com.company.Punto3.Item;
import com.company.Punto1.Rectangulo;
import com.company.Punto2.Empleado;
import com.company.Punto4.CuentaBancaria;
import com.company.Punto5.Hora;

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
            case 3:
                exercise3();
                break;
            case 4:
                exercise4();
                break;
            case 5:
                exercise5();
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
    public static void PrecioTotal(Item item, int cantidad){
        System.out.println("El precio total es: $"+ item.getPrecioUnitario()*cantidad);
    }
    public static void  exercise3(){
        Item Plancha=new Item("f45","Sirve para planchar",5,500);
        Plancha.MostrarItem(Plancha);
        PrecioTotal(Plancha,3);
    }
    public static void  exercise4(){
        CuentaBancaria account1=new CuentaBancaria(1,"Peter",5000);
        System.out.println("El balance antes de agregar dinero es: $"+ account1.getBalance());
        account1.Credit(account1.getBalance());
        System.out.println("El balance despues de agregar dinero es: $"+account1.getBalance());
        account1.Debit(account1.getBalance());
        System.out.println("El balance despues de retirar dinero es: $"+account1.getBalance());
        account1.ShowStats();

    }
    public static void exercise5(){
        Hora hora=new Hora(22,59,59);
        System.out.println(hora);
        hora.sumarSeg();
        System.out.println(hora);
        hora.restarSecond();
        System.out.println(hora);
    }
}