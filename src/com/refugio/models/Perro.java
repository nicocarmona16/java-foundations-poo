package com.refugio.models;

public class Perro extends Animal {

    public Perro(String nombre, int edad, String estadoSalud) {
        super(nombre, edad, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void prepararParaAdopcion() {
        System.out.println("Bañando al perro y poniendo collar  --- Listo para la adopcion");
    }

}
