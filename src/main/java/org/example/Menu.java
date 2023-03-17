package org.example;

import java.util.Scanner;

public class Menu {
    public void Menu1(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        //Menu del ejercicio 1 y 2
        do {
            System.out.println("Elija alguna opción del menú");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
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
                    System.out.println("Ingrese el valor de x (la base)");
                    double x2 = sc.nextDouble();
                    System.out.println("Ingrese el valor de y (la potencia)");
                    double y2 = sc.nextDouble();
                    Funcion funcion2 = new Funcion();
                    System.out.println("El resultado de la multiplicacion sucesiva es: " + funcion2.multiplicacionSucesiva2(x2, y2));
                    double resultado2 = funcion2.multiplicacionSucesiva2(x2, y2);
                    break;
                case 3:
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion !=  3);






}
}