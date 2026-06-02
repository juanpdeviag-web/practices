package org.example.meditechplus.model.abstracts;

public abstract class Persona {
    String id;
    String nombre;
    String celular;

    public Persona(String id, String nombre, String celular){
        this.id=id;
        this.nombre=nombre;
        this.celular=celular;
    }
}
