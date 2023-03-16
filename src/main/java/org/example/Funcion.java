package org.example;

public class Funcion {
    //apartado a)
    public double multiplicacionSucesiva(double x, double y) {
        double resultado = 0;
        if (y == 0) {
            return 1; //Un numero elevado a 0 es 1
        } else {
            resultado = x * multiplicacionSucesiva(x, y - 1); //Multiplicamos la base(x) por si misma la cantidad de veces que sea la potencia(y).
        }
        return resultado; //Imprimimos el resultado :)
    }
}

