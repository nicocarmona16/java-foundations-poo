package com.refugio.services;

import com.refugio.exceptions.ExcepcionAnimalEnfermo;
import com.refugio.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Refugio {

    private List<Animal> listaAnimales = new ArrayList<>();

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println(animal.getNombre() + " fue agregado");
        animal.hacerSonido();
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

    public void simularAdopcion(Animal animal) throws ExcepcionAnimalEnfermo {
        if (animal.getEstadoSalud().equalsIgnoreCase("Sano")) {
            animal.prepararParaAdopcion();
            listaAnimales.remove(animal);
        } else {
            throw new ExcepcionAnimalEnfermo("No se puede adoptar a " + animal.getNombre() + ", su estado de salud es: " + animal.getEstadoSalud());
        }
    }

}
