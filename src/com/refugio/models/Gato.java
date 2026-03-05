package com.refugio.models;

public class Gato extends Animal {

    public Gato(String nombre, int edad, String estadoSalud) {
        super(nombre, edad, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void prepararParaAdopcion() {
        System.out.println("Bañando al gato y guardando juguetes  --- Listo para la adopcion");
    }

}
