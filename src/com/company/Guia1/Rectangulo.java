package com.company.Guia1;

public class Rectangulo {
    double alto,ancho;

    public  Rectangulo(double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double CalcularPerimetro(double alto, double ancho){
        return 2*(alto+ancho);
    }
    public double CalcularArea(double alto, double ancho){
        return alto*ancho;
    }
}