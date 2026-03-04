package com.refugio;

import com.refugio.models.Animal;
import com.refugio.models.Gato;
import com.refugio.models.Perro;
import com.refugio.services.Refugio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Refugio refugio = new Refugio();

        System.out.println("*** SISTEMA DE GESTIÓN DE REFUGIO DE ANIMALES ***");

        boolean isActive = true;

        while (isActive) {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Agregar Animal - 2. Filtrar por Edad - 9. Salir");
            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Su animal es: 1. Perro - 2. Gato: ");
                    int opcAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nombre del animal: ");
                    String nombreAnimal = scanner.nextLine();

                    System.out.println("Edad del animal: ");
                    int edadAnimal = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Estado de salud del animal (Sano - Enfermo): ");
                    String estadoSaludAnimal = scanner.nextLine();

                    if (opcAnimal == 1){
                        Animal animal = new Perro(nombreAnimal, edadAnimal, estadoSaludAnimal);
                        refugio.agregarAnimal(animal);
                    } else if (opcAnimal == 2) {
                        Animal animal = new Gato(nombreAnimal, edadAnimal, estadoSaludAnimal);
                        refugio.agregarAnimal(animal);
                    } else {
                        System.out.println("La opcion de animal no es valida");
                    }
                    break;
                case 2:
                    System.out.println("Por cual edad desea filtrar? ");
                    int edadFiltro = scanner.nextInt();
                    refugio.filtrarAnimal(edadFiltro);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    isActive = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}