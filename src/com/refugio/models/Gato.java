package com.refugio.models;

import com.refugio.interfaces.Adoptable;

public class Gato extends Animal implements Adoptable {

    public Gato(String nombre, int edad, String estadoSalud) {
        super(nombre, edad, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void prepararParaAdopcion() {
        System.out.println("Bañando al gato y guardando juguetes");
    }

}
