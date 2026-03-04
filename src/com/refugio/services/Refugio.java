package com.refugio.services;

import com.refugio.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Refugio {

    private List<Animal> listaAnimales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println(animal.getNombre() + " fue agregado");
    }

    public void filtrarAnimal(int edadFiltro) {
        boolean isEncontrado = false;

        for (Animal animal : listaAnimales) {
            if (animal.getEdad() == edadFiltro) {
                System.out.println("Nombre: " + animal.getNombre() + " - Edad: " + animal.getEdad() + " - Estado Salud: " + animal.getEstadoSalud());
                animal.hacerSonido();
                isEncontrado = true;
            }
        }

        if (!isEncontrado) {
            System.out.println("No se encontraron animales");
        }
    }

    public void simularAdopcion() {

    }

}
