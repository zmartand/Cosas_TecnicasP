package org.example;

public class Funcion {
    //apartado a
    public double multiplicacionSucesiva(double x, double y) {
        double resultado = 0;
        int count = 0;
        do {
            for (int i = 0; i < y; i++) {
                resultado = Math.pow(x, y);
                count++;
            }

        } while (count != y);
        return resultado;
    }
}

