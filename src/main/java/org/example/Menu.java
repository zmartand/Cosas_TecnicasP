package org.example;

import java.util.Scanner;

public class Menu {
    public void Menu1(){
        Scanner sc = new Scanner(System.in);
        //Menu 1
        System.out.println("Elija alguna opción del menú");
        System.out.println("1. Multiplicación sucesiva");
        System.out.println("2. Salir");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Ingrese el valor de x (la base)");
                double x = sc.nextDouble();
                System.out.println("Ingrese el valor de y (la potencia)");
                double y = sc.nextDouble();
                Funcion funcion = new Funcion();
                System.out.println("El resultado de la multiplicacion sucesiva es: " + funcion.multiplicacionSucesiva(x, y));
                double resultado = funcion.multiplicacionSucesiva(x, y);
                break;
            case 2:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
    }
}
}