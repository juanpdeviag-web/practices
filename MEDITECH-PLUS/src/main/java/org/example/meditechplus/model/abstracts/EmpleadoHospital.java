package org.example.meditechplus.model.abstracts;

public abstract class EmpleadoHospital extends  Persona{

    String usuario;
    String contrasena;

    public EmpleadoHospital( String id, String nombre, String celular ,String usuario, String contrasena){
        super(id, nombre, celular);
        this.usuario=usuario;
        this.contrasena=contrasena;
    }
}
