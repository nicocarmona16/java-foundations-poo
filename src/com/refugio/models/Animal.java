package com.refugio.models;

import com.refugio.interfaces.Adoptable;

public abstract class Animal implements Adoptable {

    private String nombre;
    private int edad;
    private String estadoSalud;

    public Animal(String nombre, int edad, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public abstract void hacerSonido();

}
